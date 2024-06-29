import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class711 {

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public int field9930 = 0;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public int field9932 = 0;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "Z")
    private boolean field9937 = false;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "Z")
    public static boolean field9923 = false;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public int field9921;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public int field9922;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public int field9924;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public int field9926;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    private int field9927;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public int field9928;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public int field9929;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    public int field9931;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
    public int field9935;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public int field9936;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "J")
    public long field9933;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lji;I)V", line = 3)
    public final void method3985(class611 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3428((byte) 96);
            if (var3 == 0) {
                field9920++;
                if (arg1 != 17127) {
                    this.method3989(-122, null, (byte) -5);
                    return;
                }
                return;
            }
            this.method3989(var3, arg0, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BII)I", line = 28)
    public static final int method3986(byte arg0, int arg1, int arg2) {
        field9925++;
        if (class571.field8038 == -1) {
            return 1;
        }
        if (class11.field68.field5503.method741((byte) 122) != arg2) {
            class361.method2073(true, class755.field10493.method4201(class723.field10095, (byte) 25), arg2, true);
            if (arg2 != class11.field68.field5503.method741((byte) 126)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class725.field10121.getSize();
            if (arg0 > -77) {
                method3986((byte) -124, -85, 24);
            }
            class396.method2303(-117, class294.field3954, class399.field5650, true, class21.field142, class755.field10493.method4201(class723.field10095, (byte) 25));
            class446 var4 = class317.method1898(0, -9252, class430.field6050, class571.field8038);
            long var5 = class538.method2963(-47);
            class21.field142.method406();
            class736.field10270.method33(0, class522.field7044, 0);
            class21.field142.method367(class736.field10270);
            class21.field142.method354(var3.width / 2, var3.height / 2, 512, 512);
            class21.field142.method434(1.0F);
            class21.field142.method380(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class472 var7 = class21.field142.method407(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class21.field142.method402(0);
                class21.field142.method370();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class161.field2025.method33((int) (((float) var11 - (float) var10 / 2.0F) * (float) class601.field8373), 0, (var10 + 1) * class601.field8373);
                        var7.method230(class161.field2025, null, 0);
                        var8++;
                        if (((long) arg1) <= (class538.method2963(-47) - var5)) {
                            break label45;
                        }
                    }
                }
            }
            class21.field142.method458();
            long var12 = (long) (var8 * 1000) / (class538.method2963(-47) - var5);
            class21.field142.method402(0);
            class21.field142.method370();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 131)
    public static final void method3987(int arg0, String arg1, boolean arg2) {
        field9938++;
        if (arg1 == null) {
            return;
        }
        if (class148.field1904 >= 100) {
            class247.method1484(class755.field10519.method4201(class723.field10095, (byte) 25), 4, (byte) -40);
            return;
        }
        String var3 = class540.method2966(-1, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class148.field1904; var4++) {
            String var9 = class540.method2966(-1, class554.field7827[var4]);
            if (var9 != null && var9.equals(var3)) {
                class247.method1484(arg1 + class755.field10520.method4201(class723.field10095, (byte) 25), 4, (byte) -66);
                return;
            }
            if (class270.field3568[var4] != null) {
                String var10 = class540.method2966(-1, class270.field3568[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class247.method1484(arg1 + class755.field10520.method4201(class723.field10095, (byte) 25), 4, (byte) -84);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class233.field3026; var5++) {
            String var7 = class540.method2966(-1, class512.field6935[var5]);
            if (var7 != null && var7.equals(var3)) {
                class247.method1484(class755.field10525.method4201(class723.field10095, (byte) 25) + arg1 + class755.field10526.method4201(class723.field10095, (byte) 25), 4, (byte) 59);
                return;
            }
            if (class58.field621[var5] != null) {
                String var8 = class540.method2966(-1, class58.field621[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class247.method1484(class755.field10525.method4201(class723.field10095, (byte) 25) + arg1 + class755.field10526.method4201(class723.field10095, (byte) 25), 4, (byte) -95);
                    return;
                }
            }
        }
        if (class540.method2966(-1, class653.field9086.field1148).equals(var3)) {
            class247.method1484(class755.field10522.method4201(class723.field10095, (byte) 25), 4, (byte) -66);
            return;
        }
        class83.field1157++;
        class103 var6 = class752.method4186(260, class42.field423, class449.field6285);
        var6.field1379.method3393(class601.method3326(arg1, (byte) 90) + 1, 91);
        var6.field1379.method3387(arg1, (byte) 113);
        var6.field1379.method3393(arg2 ? 1 : 0, -89);
        if (arg0 < -40) {
            class27.method104(false, var6);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 228)
    public final void method3988(int arg0) {
        this.field9931 = class15.field115[this.field9927 << 3];
        field9934++;
        long var2 = (long) this.field9922;
        if (arg0 != 1) {
            this.field9926 = 44;
        }
        long var4 = (long) this.field9928;
        long var6 = (long) this.field9921;
        this.field9935 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field9929 == 0) {
            this.field9929 = 1;
        }
        if (this.field9936 == 0) {
            this.field9933 = 2147483647L;
        } else if (this.field9936 == 1) {
            this.field9933 = (this.field9935 * 8 / this.field9929);
            this.field9933 *= this.field9933;
        } else if (this.field9936 == 2) {
            this.field9933 = (this.field9935 * 8 / this.field9929);
        }
        if (this.field9937) {
            this.field9935 *= -1;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILji;B)V", line = 274)
    private final void method3989(int arg0, class611 arg1, byte arg2) {
        field9919++;
        if (arg0 == 1) {
            this.field9927 = arg1.method3402((byte) 127);
        } else if (arg0 == 2) {
            arg1.method3428((byte) 2);
        } else if (arg0 == 3) {
            this.field9922 = arg1.method3418(-2);
            this.field9928 = arg1.method3418(-2);
            this.field9921 = arg1.method3418(-2);
        } else if (arg0 == 4) {
            this.field9936 = arg1.method3428((byte) 90);
            this.field9929 = arg1.method3418(-2);
        } else if (arg0 == 6) {
            this.field9924 = arg1.method3428((byte) 58);
        } else if (arg0 == 8) {
            this.field9930 = 1;
        } else if (arg0 == 9) {
            this.field9932 = 1;
        } else if (arg0 == 10) {
            this.field9937 = true;
        }
        if (arg2 > -120) {
            this.field9936 = 31;
        }
    }
}
