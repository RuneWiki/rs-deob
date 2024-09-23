import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CLRWXPOI")
public class Tone {

    @OriginalMember(owner = "CLRWXPOI", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "CLRWXPOI", name = "j", descriptor = "[I")
    private int[] harmonicVolume = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "k", descriptor = "[I")
    private int[] harmonicSemitone = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "l", descriptor = "[I")
    private int[] harmonicDelay = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "n", descriptor = "I")
    private int reverbVolume = 100;

    @OriginalMember(owner = "CLRWXPOI", name = "q", descriptor = "I")
    public int length = 500;

    @OriginalMember(owner = "CLRWXPOI", name = "v", descriptor = "[I")
    private static int[] tmpPhases = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "w", descriptor = "[I")
    private static int[] tmpDelays = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "x", descriptor = "[I")
    private static int[] tmpVolumes = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "y", descriptor = "[I")
    private static int[] tmpSemitones = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "z", descriptor = "[I")
    private static int[] tmpStarts = new int[5];

    @OriginalMember(owner = "CLRWXPOI", name = "m", descriptor = "I")
    private int reverbDelay;

    @OriginalMember(owner = "CLRWXPOI", name = "r", descriptor = "I")
    public int start;

    @OriginalMember(owner = "CLRWXPOI", name = "c", descriptor = "LOZKFTHAD;")
    private Envelope amplitudeBase;

    @OriginalMember(owner = "CLRWXPOI", name = "g", descriptor = "LOZKFTHAD;")
    private Envelope amplitudeModRange;

    @OriginalMember(owner = "CLRWXPOI", name = "f", descriptor = "LOZKFTHAD;")
    private Envelope amplitudeModRate;

    @OriginalMember(owner = "CLRWXPOI", name = "i", descriptor = "LOZKFTHAD;")
    private Envelope attack;

    @OriginalMember(owner = "CLRWXPOI", name = "p", descriptor = "LOZKFTHAD;")
    private Envelope filterRange;

    @OriginalMember(owner = "CLRWXPOI", name = "b", descriptor = "LOZKFTHAD;")
    private Envelope frequencyBase;

    @OriginalMember(owner = "CLRWXPOI", name = "e", descriptor = "LOZKFTHAD;")
    private Envelope frequencyModRange;

    @OriginalMember(owner = "CLRWXPOI", name = "d", descriptor = "LOZKFTHAD;")
    private Envelope frequencyModRate;

    @OriginalMember(owner = "CLRWXPOI", name = "h", descriptor = "LOZKFTHAD;")
    private Envelope release;

    @OriginalMember(owner = "CLRWXPOI", name = "o", descriptor = "LVADHJTLJ;")
    private Filter filter;

    @OriginalMember(owner = "CLRWXPOI", name = "s", descriptor = "[I")
    private static int[] buffer;

    @OriginalMember(owner = "CLRWXPOI", name = "t", descriptor = "[I")
    private static int[] noise;

    @OriginalMember(owner = "CLRWXPOI", name = "u", descriptor = "[I")
    private static int[] sin;

    @OriginalMember(owner = "CLRWXPOI", name = "a", descriptor = "()V")
    public static final void init() {
        noise = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                noise[var0] = 1;
            } else {
                noise[var0] = -1;
            }
        }
        sin = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            sin[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        buffer = new int[220500];
    }

    @OriginalMember(owner = "CLRWXPOI", name = "a", descriptor = "(II)[I")
    public final int[] generate(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            buffer[var3] = 0;
        }
        if (arg1 < 10) {
            return buffer;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.frequencyBase.reset((byte) 8);
        this.amplitudeBase.reset((byte) 8);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.frequencyModRate != null) {
            this.frequencyModRate.reset((byte) 8);
            this.frequencyModRange.reset((byte) 8);
            var6 = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / var4);
            var7 = (int) ((double) this.frequencyModRate.start * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.amplitudeModRate != null) {
            this.amplitudeModRate.reset((byte) 8);
            this.amplitudeModRange.reset((byte) 8);
            var9 = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / var4);
            var10 = (int) ((double) this.amplitudeModRate.start * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.harmonicVolume[var12] != 0) {
                tmpPhases[var12] = 0;
                tmpDelays[var12] = (int) ((double) this.harmonicDelay[var12] * var4);
                tmpVolumes[var12] = (this.harmonicVolume[var12] << 14) / 100;
                tmpSemitones[var12] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var12]) / var4);
                tmpStarts[var12] = (int) ((double) this.frequencyBase.start * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.frequencyBase.evaluate(true, arg0);
            int var42 = this.amplitudeBase.evaluate(true, arg0);
            if (this.frequencyModRate != null) {
                int var43 = this.frequencyModRate.evaluate(true, arg0);
                int var44 = this.frequencyModRange.evaluate(true, arg0);
                var41 += this.generate(var44, 0, var8, this.frequencyModRate.form) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.amplitudeModRate != null) {
                int var45 = this.amplitudeModRate.evaluate(true, arg0);
                int var46 = this.amplitudeModRange.evaluate(true, arg0);
                var42 = var42 * ((this.generate(var46, 0, var11, this.amplitudeModRate.form) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.harmonicVolume[var47] != 0) {
                    int var48 = tmpDelays[var47] + var13;
                    if (var48 < arg0) {
                        buffer[var48] += this.generate(tmpVolumes[var47] * var42 >> 15, 0, tmpPhases[var47], this.frequencyBase.form);
                        tmpPhases[var47] += (tmpSemitones[var47] * var41 >> 16) + tmpStarts[var47];
                    }
                }
            }
        }
        if (this.release != null) {
            this.release.reset((byte) 8);
            this.attack.reset((byte) 8);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.release.evaluate(true, arg0);
                int var19 = this.attack.evaluate(true, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.release.end - this.release.start) * var18 >> 8) + this.release.start;
                } else {
                    var20 = ((this.release.end - this.release.start) * var19 >> 8) + this.release.start;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    buffer[var17] = 0;
                }
            }
        }
        if (this.reverbDelay > 0 && this.reverbVolume > 0) {
            int var21 = (int) ((double) this.reverbDelay * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                buffer[var22] += buffer[var22 - var21] * this.reverbVolume / 100;
            }
        }
        if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
            this.filterRange.reset((byte) 8);
            int var23 = this.filterRange.evaluate(true, arg0 + 1);
            int var24 = this.filter.evaluate(0, (float) var23 / 65536.0F, 201);
            int var25 = this.filter.evaluate(1, (float) var23 / 65536.0F, 201);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) buffer[var24 + var26] * (long) Filter.unity16 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) buffer[var24 + var26 - var38 - 1] * (long) Filter.coefficient16[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) buffer[var26 - var39 - 1] * (long) Filter.coefficient16[1][var39] >> 16);
                    }
                    buffer[var26] = var37;
                    var23 = this.filterRange.evaluate(true, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) buffer[var24 + var26] * (long) Filter.unity16 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) buffer[var24 + var26 - var35 - 1] * (long) Filter.coefficient16[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) buffer[var26 - var36 - 1] * (long) Filter.coefficient16[1][var36] >> 16);
                        }
                        buffer[var26] = var34;
                        var23 = this.filterRange.evaluate(true, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) buffer[var24 + var26 - var31 - 1] * (long) Filter.coefficient16[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) buffer[var26 - var32 - 1] * (long) Filter.coefficient16[1][var32] >> 16);
                            }
                            buffer[var26] = var30;
                            this.filterRange.evaluate(true, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.filter.evaluate(0, (float) var23 / 65536.0F, 201);
                    var25 = this.filter.evaluate(1, (float) var23 / 65536.0F, 201);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (buffer[var40] < -32768) {
                buffer[var40] = -32768;
            }
            if (buffer[var40] > 32767) {
                buffer[var40] = 32767;
            }
        }
        return buffer;
    }

    @OriginalMember(owner = "CLRWXPOI", name = "a", descriptor = "(IIII)I")
    private final int generate(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        if (arg3 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg3 == 2) {
            return sin[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg3 == 4) {
            return noise[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "CLRWXPOI", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public final void read(boolean arg0, Packet arg1) {
        this.frequencyBase = new Envelope();
        this.frequencyBase.read(true, arg1);
        this.amplitudeBase = new Envelope();
        if (!arg0) {
            throw new NullPointerException();
        }
        this.amplitudeBase.read(true, arg1);
        int var3 = arg1.g1();
        if (var3 != 0) {
            arg1.pos--;
            this.frequencyModRate = new Envelope();
            this.frequencyModRate.read(true, arg1);
            this.frequencyModRange = new Envelope();
            this.frequencyModRange.read(true, arg1);
        }
        int var4 = arg1.g1();
        if (var4 != 0) {
            arg1.pos--;
            this.amplitudeModRate = new Envelope();
            this.amplitudeModRate.read(true, arg1);
            this.amplitudeModRange = new Envelope();
            this.amplitudeModRange.read(true, arg1);
        }
        int var5 = arg1.g1();
        if (var5 != 0) {
            arg1.pos--;
            this.release = new Envelope();
            this.release.read(true, arg1);
            this.attack = new Envelope();
            this.attack.read(true, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.gsmarts();
            if (var7 == 0) {
                break;
            }
            this.harmonicVolume[var6] = var7;
            this.harmonicSemitone[var6] = arg1.gsmart();
            this.harmonicDelay[var6] = arg1.gsmarts();
        }
        this.reverbDelay = arg1.gsmarts();
        this.reverbVolume = arg1.gsmarts();
        this.length = arg1.g2();
        this.start = arg1.g2();
        this.filter = new Filter();
        this.filterRange = new Envelope();
        this.filter.read(arg1, false, this.filterRange);
    }
}
