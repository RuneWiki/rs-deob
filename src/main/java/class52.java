import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class52 {

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    private int field768 = 0;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "J")
    private long field769 = -1L;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "J")
    private long field783 = -1L;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Ldd;")
    private class265 field782;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "J")
    private long field790;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "J")
    private long field789;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[B")
    private byte[] field775;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "J")
    private long field791;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[B")
    private byte[] field787;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Z")
    public static boolean field772 = true;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "[I")
    public static int[] field780 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "J")
    private long field792;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lpk;")
    public static class120 field771;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Z")
    public static boolean field774;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "[[[I")
    public static int[][][] field794;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ldd;II)V", line = 3500)
    public class52(class265 arg0, int arg1, int arg2) throws IOException {
        this.field782 = arg0;
        this.field789 = this.field790 = arg0.method1828(-1);
        this.field775 = new byte[arg1];
        this.field791 = 0L;
        this.field787 = new byte[arg2];
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 14)
    private final void method422(boolean arg0) throws IOException {
        this.field786 = 0;
        if (arg0) {
            this.field791 = 9L;
        }
        if (this.field792 != this.field791) {
            this.field782.method1831(0, this.field791);
            this.field792 = this.field791;
        }
        this.field769 = this.field791;
        while (this.field786 < this.field775.length) {
            int var2 = this.field775.length - this.field786;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field782.method1833(var2, this.field775, this.field786, false);
            if (var3 == -1) {
                break;
            }
            this.field786 += var3;
            this.field792 += (long) var3;
        }
        field770++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 62)
    public static void method423(byte arg0) {
        field771 = null;
        field794 = (int[][][]) null;
        if (arg0 < -74) {
            field780 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 75)
    private final void method424(int arg0) throws IOException {
        field781++;
        if (arg0 != 96) {
            field771 = (class120) null;
        }
        if (this.field783 == -1L) {
            return;
        }
        if (this.field792 != this.field783) {
            this.field782.method1831(0, this.field783);
            this.field792 = this.field783;
        }
        long var2 = -1L;
        this.field782.method1832(0, this.field768, arg0 - 95, this.field787);
        this.field792 += (long) this.field768;
        if (this.field790 < this.field792) {
            this.field790 = this.field792;
        }
        if (this.field769 <= this.field783 && this.field783 < ((long) this.field786 + this.field769)) {
            var2 = this.field783;
        } else if (this.field769 >= this.field783 && this.field769 < (long) this.field768 + this.field783) {
            var2 = this.field769;
        }
        long var4 = -1L;
        if ((long) this.field768 + this.field783 > this.field769 && (long) this.field768 + this.field783 <= (long) this.field786 + this.field769) {
            var4 = (long) this.field768 + this.field783;
        } else if ((long) this.field786 + this.field769 > this.field783 && ((long) this.field768 + this.field783) >= ((long) this.field786 + this.field769)) {
            var4 = (long) this.field786 + this.field769;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class330.method2315(this.field787, (int) (var2 - this.field783), this.field775, (int) (var2 - this.field769), var6);
        }
        this.field768 = 0;
        this.field783 = -1L;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)Ljava/io/File;", line = 154)
    private final File method425(boolean arg0) {
        field788++;
        if (arg0) {
            this.method434((byte) -32);
        }
        return this.field782.method1830(0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BI)V", line = 170)
    public final void method426(byte[] arg0, int arg1) throws IOException {
        this.method433(0, arg0.length, arg0, arg1 ^ arg1);
        field776++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI[BI)V", line = 182)
    public final void method427(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field778++;
        try {
            if ((long) arg1 + this.field791 > this.field789) {
                this.field789 = (long) arg1 + this.field791;
            }
            if (this.field783 != -1L && (this.field791 < this.field783 || ((long) this.field768 + this.field783) < this.field791)) {
                this.method424(96);
            }
            if (this.field783 != -1L && (this.field791 + ((long) arg1)) > ((long) this.field787.length + this.field783)) {
                int var5 = (int) (this.field783 + (long) this.field787.length - this.field791);
                arg1 -= var5;
                class330.method2315(arg2, arg3, this.field787, (int) (this.field791 - this.field783), var5);
                arg3 += var5;
                this.field791 += (long) var5;
                this.field768 = this.field787.length;
                this.method424(96);
            }
            if (this.field787.length < arg1) {
                if (this.field792 != this.field791) {
                    this.field782.method1831(0, this.field791);
                    this.field792 = this.field791;
                }
                long var6 = -1L;
                this.field782.method1832(arg3, arg1, 1, arg2);
                if ((this.field791 + ((long) arg1)) > this.field769 && (long) arg1 + this.field791 <= this.field769 - -((long) this.field786)) {
                    var6 = this.field791 + ((long) arg1);
                } else if (this.field791 < (this.field769 + ((long) this.field786)) && ((long) this.field786 + this.field769) <= ((long) arg1 + this.field791)) {
                    var6 = (long) this.field786 + this.field769;
                }
                long var8 = -1L;
                if (this.field769 <= this.field791 && (long) this.field786 + this.field769 > this.field791) {
                    var8 = this.field791;
                } else if (this.field791 <= this.field769 && this.field769 < (long) arg1 + this.field791) {
                    var8 = this.field769;
                }
                this.field792 += (long) arg1;
                if (this.field790 < this.field792) {
                    this.field790 = this.field792;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class330.method2315(arg2, (int) (var8 + (long) arg3 - this.field791), this.field775, (int) (var8 - this.field769), var10);
                }
                this.field791 += (long) arg1;
            } else if (arg0 > 124 && arg1 > 0) {
                if (this.field783 == -1L) {
                    this.field783 = this.field791;
                }
                class330.method2315(arg2, arg3, this.field787, (int) (this.field791 - this.field783), arg1);
                this.field791 += (long) arg1;
                if (this.field791 - this.field783 > (long) this.field768) {
                    this.field768 = (int) (this.field791 - this.field783);
                }
            }
        } catch (IOException var12) {
            this.field792 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIZI)V", line = 321)
    public static final void method428(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 == -19765) {
            field785++;
            if (class309.method2186(arg4 ^ 0xFFFFD72B, arg0)) {
                class342.method2373(arg2, arg3, class110.field1789[arg0], -28434, -1, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lri;", line = 339)
    public static final class74 method429(int arg0, int arg1) {
        field779++;
        if (arg0 != 4618) {
            field772 = false;
        }
        class74 var2 = (class74) class16.field331.method2288((long) arg1, (byte) 83);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field942.method967(class197.method1395(arg0 - 4495, arg1), class184.method1339((byte) -111, arg1), 65280);
        class74 var4 = new class74();
        var4.field1134 = arg1;
        if (var3 != null) {
            var4.method589(arg0 - 4619, new class1(var3));
        }
        class16.field331.method2281(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(JB)V", line = 367)
    public final void method430(long arg0, byte arg1) throws IOException {
        field773++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method425(false));
        }
        if (arg1 < 94) {
            this.field768 = -38;
        }
        this.field791 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lpk;B)V", line = 388)
    public static final void method431(class120 arg0, byte arg1) {
        class178.field2840 = arg0.method958(113, "titlebg");
        class244.field3649 = arg0.method958(124, "logo");
        if (arg1 > -2) {
            field780 = (int[]) null;
        }
        field777++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z", line = 404)
    public static final boolean method432(int arg0) throws IOException {
        field767++;
        if (arg0 != -16728) {
            field771 = (class120) null;
        }
        if (class319.field5005 == null) {
            return false;
        }
        int var1 = class319.field5005.method370((byte) 125);
        if (var1 == 0) {
            return false;
        }
        if (class60.field884 == -1) {
            var1--;
            class319.field5005.method377(10647, 0, 1, class80.field1248.field34);
            class80.field1248.field48 = 0;
            class60.field884 = class80.field1248.method1798((byte) 115);
            class128.field2060 = class83.field1295[class60.field884];
        }
        if (class128.field2060 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class319.field5005.method377(arg0 + 27375, 0, 1, class80.field1248.field34);
            class128.field2060 = class80.field1248.field34[0] & 0xFF;
            var1--;
        }
        if (class128.field2060 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class319.field5005.method377(10647, 0, 2, class80.field1248.field34);
            var1 -= 2;
            class80.field1248.field48 = 0;
            class128.field2060 = class80.field1248.method56(arg0 + 36340);
        }
        if (class128.field2060 > var1) {
            return false;
        }
        class80.field1248.field48 = 0;
        class319.field5005.method377(10647, 0, class128.field2060, class80.field1248.field34);
        class172.field2761 = class340.field5248;
        class99.field1580 = 0;
        class340.field5248 = class6.field132;
        class6.field132 = class60.field884;
        if (class60.field884 == 115) {
            int var2 = class80.field1248.method56(arg0 ^ 0xFFFFF234);
            int var3 = class80.field1248.method15((byte) 121);
            int var4 = class80.field1248.method15((byte) -101);
            int var5 = class80.field1248.method56(19612);
            int var6 = class80.field1248.method15((byte) -105);
            int var7 = class80.field1248.method15((byte) -19);
            if (class169.method1263(65535, var2)) {
                class61.method497(true, var6, var7, var3, var4, 74, var5);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 216) {
            class11.method165(arg0 + 16728);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 164) {
            int var392 = class80.field1248.method15((byte) -55);
            if (class80.field1248.method15((byte) 61) == 0) {
                class34.field515[var392] = new class16();
            } else {
                class80.field1248.field48--;
                class34.field515[var392] = new class16(class80.field1248);
            }
            class144.field2329 = class200.field3060;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 93) {
            class144.field2330 = class80.field1248.method15((byte) -58);
            class318.field4989 = class80.field1248.method19(arg0 ^ 0xFFFFBE57);
            while (class80.field1248.field48 < class128.field2060) {
                class60.field884 = class80.field1248.method15((byte) -33);
                class144.method1103((byte) -92);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 245) {
            long var8 = class80.field1248.method28((byte) -53);
            long var10 = (long) class80.field1248.method56(19612);
            long var12 = (long) class80.field1248.method4(true);
            long var14 = (var10 << 32) + var12;
            int var16 = class80.field1248.method15((byte) 113);
            boolean var17 = false;
            int var18 = class80.field1248.method56(19612);
            int var19 = 0;
            label1251: while (true) {
                if (var19 >= 100) {
                    if (var16 <= 1) {
                        for (int var20 = 0; var20 < class321.field5024; var20++) {
                            if (class158.field2587[var20] == var8) {
                                var17 = true;
                                break label1251;
                            }
                        }
                    }
                    break;
                }
                if (class264.field3899[var19] == var14) {
                    var17 = true;
                    break;
                }
                var19++;
            }
            if (!var17 && class293.field4602 == 0) {
                class264.field3899[class11.field260] = var14;
                class11.field260 = (class11.field260 + 1) % 100;
                String var21 = class63.method502(-32769, var18).method2291(class80.field1248, 1);
                if (var16 == 2) {
                    class115.method901(18, -81, var18, "<img=1>" + class150.method1134(-33, var8), var21, (String) null);
                } else if (var16 == 1) {
                    class115.method901(18, -90, var18, "<img=0>" + class150.method1134(-48, var8), var21, (String) null);
                } else {
                    class115.method901(18, arg0 + 16608, var18, class150.method1134(-49, var8), var21, (String) null);
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 235) {
            int var387 = class80.field1248.method39(-7872);
            int var388 = class80.field1248.method15((byte) 95);
            int var389 = class80.field1248.method39(-7872);
            int var390 = class80.field1248.method33(false);
            if (class169.method1263(arg0 ^ 0xFFFF4157, var389)) {
                class24 var391 = (class24) class158.field2584.method79((long) var390, (byte) 0);
                if (var391 != null) {
                    class190.method1367(0, var391.field417 != var387, var391);
                }
                class229.method1664(false, var390, var387, var388);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 132) {
            int var22 = class80.field1248.method60((byte) 108);
            int var23 = class80.field1248.method58((byte) -78);
            int var24 = class80.field1248.method39(-7872);
            if (class169.method1263(65535, var23)) {
                class106.method848(var22, (byte) -105, var24);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 239) {
            class318.field4989 = class80.field1248.method3((byte) -117);
            class144.field2330 = class80.field1248.method19(255);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 62) {
            String var346 = class80.field1248.method53(32);
            if (var346.endsWith(":tradereq:")) {
                String var382 = var346.substring(0, var346.indexOf(":"));
                boolean var383 = false;
                long var384 = class106.method851(var382, -26);
                for (int var386 = 0; var386 < class321.field5024; var386++) {
                    if (class158.field2587[var386] == var384) {
                        var383 = true;
                        break;
                    }
                }
                if (!var383 && class293.field4602 == 0) {
                    class129.method1003(4, class113.field1831, var382, 125);
                }
            } else if (var346.endsWith(":chalreq:")) {
                String var347 = var346.substring(0, var346.indexOf(":"));
                long var348 = class106.method851(var347, arg0 ^ 0x4171);
                boolean var350 = false;
                for (int var351 = 0; var351 < class321.field5024; var351++) {
                    if (class158.field2587[var351] == var348) {
                        var350 = true;
                        break;
                    }
                }
                if (!var350 && class293.field4602 == 0) {
                    String var352 = var346.substring(var346.indexOf(":") + 1, var346.length() - 9);
                    class129.method1003(8, var352, var347, -117);
                }
            } else if (var346.endsWith(":assistreq:")) {
                String var353 = var346.substring(0, var346.indexOf(":"));
                long var354 = class106.method851(var353, arg0 ^ 0x4162);
                boolean var356 = false;
                for (int var357 = 0; var357 < class321.field5024; var357++) {
                    if (class158.field2587[var357] == var354) {
                        var356 = true;
                        break;
                    }
                }
                if (!var356 && class293.field4602 == 0) {
                    class129.method1003(10, "", var353, 48);
                }
            } else if (var346.endsWith(":clan:")) {
                String var358 = var346.substring(0, var346.indexOf(":clan:"));
                class129.method1003(11, var358, "", -128);
            } else if (var346.endsWith(":trade:")) {
                String var359 = var346.substring(0, var346.indexOf(":trade:"));
                if (class293.field4602 == 0) {
                    class129.method1003(12, var359, "", 74);
                }
            } else if (var346.endsWith(":assist:")) {
                String var381 = var346.substring(0, var346.indexOf(":assist:"));
                if (class293.field4602 == 0) {
                    class129.method1003(13, var381, "", -114);
                }
            } else if (var346.endsWith(":duelstake:")) {
                String var376 = var346.substring(0, var346.indexOf(":"));
                long var377 = class106.method851(var376, -45);
                boolean var379 = false;
                for (int var380 = 0; var380 < class321.field5024; var380++) {
                    if (class158.field2587[var380] == var377) {
                        var379 = true;
                        break;
                    }
                }
                if (!var379 && class293.field4602 == 0) {
                    class129.method1003(14, "", var376, 105);
                }
            } else if (var346.endsWith(":duelfriend:")) {
                String var371 = var346.substring(0, var346.indexOf(":"));
                boolean var372 = false;
                long var373 = class106.method851(var371, -86);
                for (int var375 = 0; var375 < class321.field5024; var375++) {
                    if (class158.field2587[var375] == var373) {
                        var372 = true;
                        break;
                    }
                }
                if (!var372 && class293.field4602 == 0) {
                    class129.method1003(15, "", var371, 121);
                }
            } else if (var346.endsWith(":clanreq:")) {
                String var360 = var346.substring(0, var346.indexOf(":"));
                long var361 = class106.method851(var360, -100);
                boolean var363 = false;
                for (int var364 = 0; var364 < class321.field5024; var364++) {
                    if (class158.field2587[var364] == var361) {
                        var363 = true;
                        break;
                    }
                }
                if (!var363 && class293.field4602 == 0) {
                    class129.method1003(16, "", var360, -85);
                }
            } else if (var346.endsWith(":allyreq:")) {
                String var365 = var346.substring(0, var346.indexOf(":"));
                long var366 = class106.method851(var365, -101);
                boolean var368 = false;
                for (int var369 = 0; var369 < class321.field5024; var369++) {
                    if (class158.field2587[var369] == var366) {
                        var368 = true;
                        break;
                    }
                }
                if (!var368 && class293.field4602 == 0) {
                    String var370 = var346.substring(var346.indexOf(":") + 1, var346.length() + -9);
                    class129.method1003(21, var370, var365, 120);
                }
            } else {
                class129.method1003(0, var346, "", -117);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 108) {
            int var343 = class80.field1248.method33(false);
            String var344 = class80.field1248.method53(32);
            int var345 = class80.field1248.method58((byte) -78);
            if (class169.method1263(65535, var345)) {
                class213.method1551(var344, -13690, var343);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 197) {
            String var25 = class80.field1248.method53(32);
            int var26 = class80.field1248.method56(19612);
            int var27 = class80.field1248.method29(15976);
            if (class169.method1263(65535, var27)) {
                class68.method540(var25, var26, false);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 41) {
            int var339 = class80.field1248.method56(19612);
            if (var339 == 65535) {
                var339 = -1;
            }
            int var340 = class80.field1248.method15((byte) 126);
            int var341 = class80.field1248.method56(arg0 + 36340);
            int var342 = class80.field1248.method15((byte) 60);
            class188.method1360(var340, var341, var342, var339, -1);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 103) {
            int var28 = class80.field1248.method33(false);
            int var29 = class80.field1248.method56(arg0 ^ 0xFFFFF234);
            if (var28 < -70000) {
                var29 += 32768;
            }
            class266 var30;
            if (var28 < 0) {
                var30 = null;
            } else {
                var30 = class171.method1276(var28, (byte) -126);
            }
            while (class80.field1248.field48 < class128.field2060) {
                int var31 = class80.field1248.method63(127);
                int var32 = class80.field1248.method56(19612);
                int var33 = 0;
                if (var32 != 0) {
                    var33 = class80.field1248.method15((byte) 67);
                    if (var33 == 255) {
                        var33 = class80.field1248.method33(false);
                    }
                }
                if (var30 != null && var31 >= 0 && var30.field3928.length > var31) {
                    var30.field3928[var31] = var32;
                    var30.field3976[var31] = var33;
                }
                class117.method923(var29, arg0 ^ 0xFFFFCF9B, var32 - 1, var33, var31);
            }
            if (var30 != null) {
                class280.method1971((byte) 101, var30);
            }
            class314.method2221(arg0 + 16760);
            class259.field3846[class164.method1234(class78.field1217++, 31)] = class164.method1234(32767, var29);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 241) {
            int var336 = class80.field1248.method62(false);
            int var337 = class80.field1248.method29(15976);
            int var338 = class80.field1248.method39(-7872);
            if (class169.method1263(65535, var337)) {
                class243.method1715(var338, var336, -119);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 60) {
            if (class128.field2060 == 0) {
                class321.field5023 = class84.field1329;
            } else {
                class321.field5023 = class80.field1248.method53(arg0 ^ 0xFFFFBE88);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 122) {
            long var320 = class80.field1248.method28((byte) -53);
            class80.field1248.method55(4);
            long var322 = class80.field1248.method28((byte) -53);
            long var324 = (long) class80.field1248.method56(19612);
            long var326 = (long) class80.field1248.method4(true);
            long var328 = (var324 << 32) + var326;
            int var330 = class80.field1248.method15((byte) 67);
            int var331 = class80.field1248.method56(19612);
            boolean var332 = false;
            int var333 = 0;
            label1629: while (true) {
                if (var333 < 100) {
                    if (class264.field3899[var333] != var328) {
                        var333++;
                        continue;
                    }
                    var332 = true;
                    break;
                }
                if (var330 <= 1) {
                    for (int var334 = 0; var334 < class321.field5024; var334++) {
                        if (class158.field2587[var334] == var320) {
                            var332 = true;
                            break label1629;
                        }
                    }
                }
                break;
            }
            if (!var332 && class293.field4602 == 0) {
                class264.field3899[class11.field260] = var328;
                class11.field260 = (class11.field260 + 1) % 100;
                String var335 = class63.method502(arg0 - 16041, var331).method2291(class80.field1248, arg0 ^ 0xFFFFBEA9);
                if (var330 == 2 || var330 == 3) {
                    class115.method901(20, 50, var331, "<img=1>" + class150.method1134(120, var320), var335, class150.method1134(-40, var322));
                } else if (var330 == 1) {
                    class115.method901(20, -117, var331, "<img=0>" + class150.method1134(arg0 ^ 0x417F, var320), var335, class150.method1134(-56, var322));
                } else {
                    class115.method901(20, arg0 ^ 0x410F, var331, class150.method1134(arg0 ^ 0x4119, var320), var335, class150.method1134(49, var322));
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 153) {
            int var313 = class80.field1248.method57(-27);
            int var314 = class80.field1248.method58((byte) -78);
            int var315 = class80.field1248.method62(false);
            if (class169.method1263(65535, var314)) {
                class24 var316 = (class24) class158.field2584.method79((long) var315, (byte) 0);
                class24 var317 = (class24) class158.field2584.method79((long) var313, (byte) 0);
                if (var317 != null) {
                    class190.method1367(0, var316 == null || var316.field417 != var317.field417, var317);
                }
                if (var316 != null) {
                    var316.method489(false);
                    class158.field2584.method75(var316, -1, (long) var313);
                }
                class266 var318 = class171.method1276(var315, (byte) -128);
                if (var318 != null) {
                    class280.method1971((byte) 101, var318);
                }
                class266 var319 = class171.method1276(var313, (byte) -119);
                if (var319 != null) {
                    class280.method1971((byte) 101, var319);
                    class76.method602(true, 0, var319);
                }
                if (class168.field2707 != -1) {
                    class79.method618(1, class168.field2707, 26822);
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 107) {
            int var34 = class80.field1248.method39(arg0 + 8856);
            int var35 = class80.field1248.method56(19612);
            int var36 = class80.field1248.method33(false);
            if (class169.method1263(65535, var34)) {
                class78.method614((byte) -25, var35, var36);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 61) {
            int var279 = class80.field1248.method58((byte) -78);
            int var280 = class80.field1248.method29(arg0 + 32704);
            int var281 = class80.field1248.method29(arg0 + 32704);
            int var282 = class80.field1248.method60((byte) 119);
            if (var282 >> 30 != 0) {
                int var307 = (var282 >> 14 & 0x3FFF) - class117.field1902;
                int var308 = var282 >> 28 & 0x3;
                int var309 = (var282 & 0x3FFF) - class133.field2118;
                if (var307 >= 0 && var309 >= 0 && var307 < 104 && var309 < 104) {
                    int var310 = var309 * 128 + 64;
                    int var311 = var307 * 128 + 64;
                    class76 var312 = new class76(var280, var308, var311, var310, class170.method1265(var311, var310, var308, 1) - var279, var281, class307.field4869);
                    class143.field2320.method277(new class93(var312), (byte) -119);
                }
            } else if ((var282 >> 29) != 0) {
                int var283 = var282 & 0xFFFF;
                class86 var284 = class197.field3029[var283];
                if (var284 != null) {
                    if (var280 == 65535) {
                        var280 = -1;
                    }
                    boolean var285 = true;
                    if (var280 != -1 && var284.field4679 != -1) {
                        if (var284.field4679 == var280) {
                            class74 var286 = method429(4618, var280);
                            if (var286.field1124 && var286.field1135 != -1) {
                                class38 var287 = class63.method503(var286.field1135, (byte) 79);
                                int var288 = var287.field575;
                                if (var288 == 1) {
                                    var284.field4681 = 0;
                                    var285 = false;
                                    var284.field4678 = 1;
                                    var284.field4646 = 0;
                                    var284.field4708 = class307.field4869 + var281;
                                    var284.field4617 = 0;
                                    class28.method246(false, 255, var284.field4681, var284.field4671, var287, var284.field4672);
                                } else if (var288 == 2) {
                                    var285 = false;
                                    var284.field4634 = 0;
                                }
                            }
                        } else {
                            class74 var289 = method429(4618, var280);
                            class74 var290 = method429(arg0 + 21346, var284.field4679);
                            if (var289.field1135 != -1 && var290.field1135 != -1) {
                                class38 var291 = class63.method503(var289.field1135, (byte) 124);
                                class38 var292 = class63.method503(var290.field1135, (byte) 71);
                                if (var292.field583 > var291.field583) {
                                    var285 = false;
                                }
                            }
                        }
                    }
                    if (var285) {
                        var284.field4647 = var279;
                        var284.field4678 = 1;
                        var284.field4617 = 0;
                        var284.field4708 = class307.field4869 + var281;
                        var284.field4679 = var280;
                        var284.field4681 = 0;
                        if (var284.field4708 > class307.field4869) {
                            var284.field4681 = -1;
                        }
                        if (var284.field4679 != -1 && class307.field4869 == var284.field4708) {
                            int var293 = method429(4618, var284.field4679).field1135;
                            if (var293 != -1) {
                                class38 var294 = class63.method503(var293, (byte) 75);
                                if (var294 != null && var294.field584 != null) {
                                    class28.method246(false, arg0 + 16983, 0, var284.field4671, var294, var284.field4672);
                                }
                            }
                        }
                    }
                }
            } else if (var282 >> 28 != 0) {
                int var295 = var282 & 0xFFFF;
                class92 var296;
                if (class75.field1146 == var295) {
                    var296 = class345.field5363;
                } else {
                    var296 = class74.field1140[var295];
                }
                if (var296 != null) {
                    boolean var297 = true;
                    if (var280 == 65535) {
                        var280 = -1;
                    }
                    if (var280 != -1 && var296.field4679 != -1) {
                        if (var296.field4679 == var280) {
                            class74 var298 = method429(4618, var280);
                            if (var298.field1124 && var298.field1135 != -1) {
                                class38 var299 = class63.method503(var298.field1135, (byte) 100);
                                int var300 = var299.field575;
                                if (var300 == 1) {
                                    var296.field4708 = class307.field4869 + var281;
                                    var297 = false;
                                    var296.field4681 = 0;
                                    var296.field4617 = 0;
                                    var296.field4678 = 1;
                                    var296.field4646 = 0;
                                    class28.method246(false, 255, var296.field4681, var296.field4671, var299, var296.field4672);
                                } else if (var300 == 2) {
                                    var296.field4634 = 0;
                                    var297 = false;
                                }
                            }
                        } else {
                            class74 var301 = method429(4618, var280);
                            class74 var302 = method429(arg0 + 21346, var296.field4679);
                            if (var301.field1135 != -1 && var302.field1135 != -1) {
                                class38 var303 = class63.method503(var301.field1135, (byte) 87);
                                class38 var304 = class63.method503(var302.field1135, (byte) 87);
                                if (var303.field583 < var304.field583) {
                                    var297 = false;
                                }
                            }
                        }
                    }
                    if (var297) {
                        var296.field4647 = var279;
                        var296.field4678 = 1;
                        var296.field4708 = class307.field4869 + var281;
                        var296.field4679 = var280;
                        if (var296.field4679 == 65535) {
                            var296.field4679 = -1;
                        }
                        var296.field4681 = 0;
                        if (class307.field4869 < var296.field4708) {
                            var296.field4681 = -1;
                        }
                        var296.field4617 = 0;
                        if (var296.field4679 != -1 && class307.field4869 == var296.field4708) {
                            int var305 = method429(4618, var296.field4679).field1135;
                            if (var305 != -1) {
                                class38 var306 = class63.method503(var305, (byte) 90);
                                if (var306 != null && var306.field584 != null) {
                                    class28.method246(class345.field5363 == var296, arg0 ^ 0xFFFFBE57, 0, var296.field4671, var306, var296.field4672);
                                }
                            }
                        }
                    }
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 243) {
            int var37 = class80.field1248.method39(-7872);
            byte var38 = class80.field1248.method18((byte) -119);
            class232.method1677((byte) -94, var37, var38);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 102) {
            int var276 = class80.field1248.method56(19612);
            int var277 = class80.field1248.method33(false);
            if (class169.method1263(arg0 ^ 0xFFFF4157, var276)) {
                class24 var278 = (class24) class158.field2584.method79((long) var277, (byte) 0);
                if (var278 != null) {
                    class190.method1367(arg0 ^ 0xFFFFBEA8, true, var278);
                }
                if (class49.field757 != null) {
                    class280.method1971((byte) 101, class49.field757);
                    class49.field757 = null;
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 183) {
            for (int var275 = 0; var275 < class123.field1998.length; var275++) {
                if (class93.field1518[var275] != class123.field1998[var275]) {
                    class123.field1998[var275] = class93.field1518[var275];
                    class314.method2210(31845, var275);
                    class117.field1900[class164.method1234(31, class121.field1980++)] = var275;
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 219) {
            int var39 = class80.field1248.method58((byte) -78);
            int var40 = class80.field1248.method62(false);
            class232.method1677((byte) -94, var39, var40);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 116) {
            int var272 = class80.field1248.method19(255);
            int var273 = class80.field1248.method15((byte) -50);
            int var274 = class80.field1248.method3((byte) -117);
            class75.field1153 = var274 >> 1;
            class345.field5363.method736(var273, -2436, var272, (var274 & 0x1) == 1);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 111 || class60.field884 == 26 || class60.field884 == 92 || class60.field884 == 203 || class60.field884 == 237 || class60.field884 == 131 || class60.field884 == 199 || class60.field884 == 218 || class60.field884 == 230 || class60.field884 == 29 || class60.field884 == 134 || class60.field884 == 63 || class60.field884 == 45 || class60.field884 == 67) {
            class144.method1103((byte) -92);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 105) {
            class80.field1248.field48 += 28;
            if (class80.field1248.method23(false)) {
                class169.method1262(arg0 + 41586, class80.field1248, class80.field1248.field48 - 28);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 167) {
            int var41 = class80.field1248.method56(19612);
            int var42 = class80.field1248.method15((byte) -60);
            int var43 = class80.field1248.method15((byte) -14);
            int var44 = class80.field1248.method56(arg0 + 36340);
            int var45 = class80.field1248.method15((byte) -98);
            int var46 = class80.field1248.method15((byte) -64);
            if (class169.method1263(65535, var41)) {
                class303.method2153(var44, 1, var42, var45, var46, var43);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 37) {
            int var265 = class80.field1248.method57(arg0 + 16853);
            int var266 = class80.field1248.method29(arg0 + 32704);
            int var267 = class80.field1248.method39(arg0 ^ 0x5FE8);
            if (var267 == 65535) {
                var267 = -1;
            }
            int var268 = class80.field1248.method33(false);
            if (class169.method1263(65535, var266)) {
                class266 var269 = class171.method1276(var265, (byte) 49);
                if (var269.field4043) {
                    class259.method1793(24017, var267, var265, var268);
                    class135 var270 = class188.method1361(true, var267);
                    class139.method1064(var270.field2157, (byte) 57, var270.field2204, var265, var270.field2167);
                    class180.method1318(95, var270.field2132, var270.field2205, var270.field2169, var265);
                } else if (var267 == -1) {
                    class60.field884 = -1;
                    var269.field4003 = 0;
                    return true;
                } else {
                    class135 var271 = class188.method1361(true, var267);
                    var269.field4105 = var271.field2204 * 100 / var268;
                    var269.field4020 = var271.field2157;
                    var269.field4005 = var267;
                    var269.field4003 = 4;
                    var269.field3968 = var271.field2167;
                    class280.method1971((byte) 101, var269);
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 119) {
            for (int var263 = 0; var263 < class74.field1140.length; var263++) {
                if (class74.field1140[var263] != null) {
                    class74.field1140[var263].field4660 = -1;
                }
            }
            for (int var264 = 0; var264 < class197.field3029.length; var264++) {
                if (class197.field3029[var264] != null) {
                    class197.field3029[var264].field4660 = -1;
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 182) {
            int var47 = class80.field1248.method29(arg0 + 32704);
            int var48 = class80.field1248.method33(false);
            int var49 = class80.field1248.method56(19612);
            int var50 = class80.field1248.method39(-7872);
            if (class169.method1263(65535, var47)) {
                class180.method1321(var48, (var49 << 16) + var50, -91);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 95) {
            int var260 = class80.field1248.method39(-7872);
            int var261 = class80.field1248.method58((byte) -78);
            if (var261 == 65535) {
                var261 = -1;
            }
            int var262 = class80.field1248.method33(false);
            if (class169.method1263(arg0 ^ 0xFFFF4157, var260)) {
                class308.method2182(-1, 4, var261, 2, var262);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 125) {
            class285.method1994((byte) -125);
            class314.method2221(arg0 + 16760);
            class60.field884 = -1;
            class121.field1980 += 32;
            return true;
        } else if (class60.field884 == 22) {
            long var247 = class80.field1248.method28((byte) -53);
            long var249 = (long) class80.field1248.method56(arg0 + 36340);
            long var251 = (long) class80.field1248.method4(true);
            long var253 = (var249 << 32) + var251;
            boolean var255 = false;
            int var256 = class80.field1248.method15((byte) 60);
            int var257 = 0;
            label1557: while (true) {
                if (var257 >= 100) {
                    if (var256 <= 1) {
                        if ((!class241.field3614 || class173.field2768) && !class241.field3615) {
                            for (int var258 = 0; var258 < class321.field5024; var258++) {
                                if (class158.field2587[var258] == var247) {
                                    var255 = true;
                                    break label1557;
                                }
                            }
                        } else {
                            var255 = true;
                        }
                    }
                    break;
                }
                if (class264.field3899[var257] == var253) {
                    var255 = true;
                    break;
                }
                var257++;
            }
            if (!var255 && class293.field4602 == 0) {
                class264.field3899[class11.field260] = var253;
                class11.field260 = (class11.field260 + 1) % 100;
                String var259 = class205.method1478(class118.method928(class331.method2322(class80.field1248, (byte) -102), 2));
                if (var256 == 2 || var256 == 3) {
                    class129.method1003(7, var259, "<img=1>" + class150.method1134(64, var247), -83);
                } else if (var256 == 1) {
                    class129.method1003(7, var259, "<img=0>" + class150.method1134(arg0 + 16834, var247), -114);
                } else {
                    class129.method1003(3, var259, class150.method1134(-51, var247), arg0 ^ 0xFFFFBEE8);
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 38) {
            int var245 = class80.field1248.method30(-683);
            int var246 = class80.field1248.method58((byte) -78);
            if (var246 == 65535) {
                var246 = -1;
            }
            class83.method656((byte) -100, var245, var246);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 212) {
            int var51 = class80.field1248.method56(19612);
            if (var51 == 65535) {
                var51 = -1;
            }
            int var52 = class80.field1248.method8(false);
            int var53 = class80.field1248.method19(255);
            class120.method954(var52, 102, var51, var53);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 8) {
            int var240 = class80.field1248.method39(-7872);
            int var241 = class80.field1248.method58((byte) -78);
            int var242 = class80.field1248.method29(15976);
            int var243 = class80.field1248.method60((byte) 112);
            int var244 = class80.field1248.method39(-7872);
            if (class169.method1263(arg0 + 82263, var241)) {
                class139.method1064(var240, (byte) 57, var242, var243, var244);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 69) {
            int var230 = class80.field1248.method60((byte) 125);
            int var231 = class80.field1248.method58((byte) -78);
            int var232 = class80.field1248.method39(arg0 + 8856);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var233 = class80.field1248.method39(-7872);
            int var234 = class80.field1248.method58((byte) -78);
            if (var234 == 65535) {
                var234 = -1;
            }
            if (class169.method1263(arg0 + 82263, var233)) {
                for (int var235 = var234; var235 <= var231; var235++) {
                    long var236 = ((long) var230 << 32) + (long) var235;
                    class257 var238 = (class257) class233.field3545.method79(var236, (byte) 0);
                    class257 var239;
                    if (var238 != null) {
                        var239 = new class257(var238.field3822, var232);
                        var238.method489(false);
                    } else if (var235 == -1) {
                        var239 = new class257(class171.method1276(var230, (byte) -124).field3936.field3822, var232);
                    } else {
                        var239 = new class257(0, var232);
                    }
                    class233.field3545.method75(var239, -1, var236);
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 96) {
            int var222 = class80.field1248.method33(false);
            int var223 = class80.field1248.method56(19612);
            class266 var224;
            if (var222 < 0) {
                var224 = null;
            } else {
                var224 = class171.method1276(var222, (byte) -125);
            }
            if (var224 != null) {
                for (int var225 = 0; var225 < var224.field3928.length; var225++) {
                    var224.field3928[var225] = 0;
                    var224.field3976[var225] = 0;
                }
            }
            if (var222 < -70000) {
                var223 += 32768;
            }
            class171.method1275((byte) -31, var223);
            int var226 = class80.field1248.method56(19612);
            for (int var227 = 0; var227 < var226; var227++) {
                int var228 = class80.field1248.method15((byte) -88);
                if (var228 == 255) {
                    var228 = class80.field1248.method60((byte) 120);
                }
                int var229 = class80.field1248.method29(arg0 ^ 0xFFFF80C0);
                if (var224 != null && var227 < var224.field3928.length) {
                    var224.field3928[var227] = var229;
                    var224.field3976[var227] = var228;
                }
                class117.method923(var223, 28979, var229 - 1, var228, var227);
            }
            if (var224 != null) {
                class280.method1971((byte) 101, var224);
            }
            class314.method2221(32);
            class259.field3846[class164.method1234(class78.field1217++, 31)] = class164.method1234(32767, var223);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 214) {
            String var54 = class80.field1248.method53(arg0 ^ 0xFFFFBE88);
            int var55 = class80.field1248.method39(-7872);
            int var56 = class80.field1248.method58((byte) -78);
            if (class169.method1263(65535, var56)) {
                class68.method540(var54, var55, false);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 247) {
            class260.field3870 = class80.field1248.method29(15976) * 30;
            class142.field2294 = class200.field3060;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 128) {
            int var57 = class80.field1248.method39(-7872);
            int var58 = class80.field1248.method58((byte) -78);
            byte var59 = class80.field1248.method55(4);
            if (class169.method1263(65535, var57)) {
                class243.method1715(var58, var59, arg0 ^ 0x4126);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 58) {
            int var218 = class80.field1248.method39(arg0 + 8856);
            int var219 = class80.field1248.method30(-683);
            int var220 = class80.field1248.method29(arg0 + 32704);
            if (class169.method1263(65535, var218)) {
                if (var219 == 2) {
                    class74.method590(-127);
                }
                class168.field2707 = var220;
                class2.method67(var220, (byte) -112);
                class281.method1978(-1681, false);
                class268.method1860((byte) -8, class168.field2707);
                for (int var221 = 0; var221 < 100; var221++) {
                    class280.field4378[var221] = true;
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 5) {
            class144.field2330 = class80.field1248.method15((byte) 64);
            class318.field4989 = class80.field1248.method15((byte) 93);
            for (int var60 = class318.field4989; var60 < class318.field4989 + 8; var60++) {
                for (int var61 = class144.field2330; var61 < class144.field2330 + 8; var61++) {
                    if (class316.field4985[class75.field1153][var60][var61] != null) {
                        class316.field4985[class75.field1153][var60][var61] = null;
                        class63.method504(var61, var60, true);
                    }
                }
            }
            for (class43 var62 = (class43) class181.field2876.method268(-1); var62 != null; var62 = (class43) class181.field2876.method278(1)) {
                if (class318.field4989 <= var62.field686 && var62.field686 < (class318.field4989 + 8) && var62.field688 >= class144.field2330 && var62.field688 < class144.field2330 + 8 && class75.field1153 == var62.field687) {
                    var62.field682 = 0;
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 72) {
            int var63 = class80.field1248.method3((byte) -117);
            int var64 = class80.field1248.method58((byte) -78);
            if (class169.method1263(65535, var64)) {
                class314.field4953 = var63;
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 129) {
            int var65 = class80.field1248.method33(false);
            int var66 = class80.field1248.method56(19612);
            if (class169.method1263(arg0 ^ 0xFFFF4157, var66)) {
                int var67 = 0;
                if (class345.field5363.field1485 != null) {
                    var67 = class345.field5363.field1485.method1916((byte) 21);
                }
                class308.method2182(-1, arg0 ^ -16724, var67, 3, var65);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 7) {
            int var213 = class80.field1248.method29(15976);
            int var214 = class80.field1248.method56(19612);
            int var215 = class80.field1248.method29(arg0 + 32704);
            int var216 = class80.field1248.method58((byte) -78);
            int var217 = class80.field1248.method62(false);
            if (class169.method1263(65535, var214)) {
                class308.method2182(var216, 4, var213 | var215 << 16, 7, var217);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 135) {
            int var209 = class80.field1248.method56(19612);
            int var210 = class80.field1248.method39(-7872);
            int var211 = class80.field1248.method19(255);
            class86 var212 = class197.field3029[var209];
            if (var212 != null) {
                class31.method283(var211, 26506, var210, var212);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 117) {
            long var68 = class80.field1248.method28((byte) -53);
            class80.field1248.method55(4);
            long var70 = class80.field1248.method28((byte) -53);
            long var72 = (long) class80.field1248.method56(arg0 ^ 0xFFFFF234);
            long var74 = (long) class80.field1248.method4(true);
            long var76 = (var72 << 32) + var74;
            int var78 = class80.field1248.method15((byte) 100);
            boolean var79 = false;
            int var80 = 0;
            label1290: while (true) {
                if (var80 >= 100) {
                    if (var78 <= 1) {
                        if ((!class241.field3614 || class173.field2768) && !class241.field3615) {
                            for (int var81 = 0; var81 < class321.field5024; var81++) {
                                if (class158.field2587[var81] == var68) {
                                    var79 = true;
                                    break label1290;
                                }
                            }
                        } else {
                            var79 = true;
                        }
                    }
                    break;
                }
                if (class264.field3899[var80] == var76) {
                    var79 = true;
                    break;
                }
                var80++;
            }
            if (!var79 && class293.field4602 == 0) {
                class264.field3899[class11.field260] = var76;
                class11.field260 = (class11.field260 + 1) % 100;
                String var82 = class205.method1478(class118.method928(class331.method2322(class80.field1248, (byte) -107), 2));
                if (var78 == 2 || var78 == 3) {
                    class82.method650(9, class150.method1134(arg0 ^ 0xFFFFBE90, var70), var82, (byte) -107, "<img=1>" + class150.method1134(arg0 ^ 0xFFFFBEFD, var68));
                } else if (var78 == 1) {
                    class82.method650(9, class150.method1134(-43, var70), var82, (byte) -110, "<img=0>" + class150.method1134(-99, var68));
                } else {
                    class82.method650(9, class150.method1134(arg0 + 16846, var70), var82, (byte) -118, class150.method1134(60, var68));
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 223) {
            long var83 = class80.field1248.method28((byte) -53);
            int var85 = class80.field1248.method56(arg0 + 36340);
            int var86 = class80.field1248.method15((byte) 101);
            String var87 = "";
            boolean var88 = true;
            if (var83 < 0L) {
                var83 &= Long.MAX_VALUE;
                var88 = false;
            }
            if (var85 > 0) {
                var87 = class80.field1248.method53(32);
            }
            String var89 = class150.method1134(121, var83);
            for (int var90 = 0; var90 < class172.field2763; var90++) {
                if (class130.field2080[var90] == var83) {
                    if (class296.field4725[var90] != var85) {
                        class296.field4725[var90] = var85;
                        if (var85 > 0) {
                            class129.method1003(5, var89 + class318.field4997, "", -107);
                        }
                        if (var85 == 0) {
                            class129.method1003(5, var89 + class110.field1788, "", 59);
                        }
                    }
                    var89 = null;
                    class172.field2759[var90] = var87;
                    class227.field3506[var90] = var86;
                    class301.field4799[var90] = var88;
                    break;
                }
            }
            boolean var91 = false;
            if (var89 != null && class172.field2763 < 200) {
                class130.field2080[class172.field2763] = var83;
                class129.field2066[class172.field2763] = var89;
                class296.field4725[class172.field2763] = var85;
                class172.field2759[class172.field2763] = var87;
                class227.field3506[class172.field2763] = var86;
                class301.field4799[class172.field2763] = var88;
                class172.field2763++;
            }
            int var92 = class172.field2763;
            class11.field254 = class200.field3060;
            while (var92 > 0) {
                boolean var93 = true;
                var92--;
                for (int var94 = 0; var94 < var92; var94++) {
                    if (class296.field4725[var94] != class1.field72 && class296.field4725[var94 + 1] == class1.field72 || class296.field4725[var94] == 0 && class296.field4725[var94 + 1] != 0) {
                        int var95 = class296.field4725[var94];
                        class296.field4725[var94] = class296.field4725[var94 + 1];
                        var93 = false;
                        class296.field4725[var94 + 1] = var95;
                        String var96 = class172.field2759[var94];
                        class172.field2759[var94] = class172.field2759[var94 + 1];
                        class172.field2759[var94 + 1] = var96;
                        String var97 = class129.field2066[var94];
                        class129.field2066[var94] = class129.field2066[var94 + 1];
                        class129.field2066[var94 + 1] = var97;
                        long var98 = class130.field2080[var94];
                        class130.field2080[var94] = class130.field2080[var94 + 1];
                        class130.field2080[var94 + 1] = var98;
                        int var100 = class227.field3506[var94];
                        class227.field3506[var94] = class227.field3506[var94 + 1];
                        class227.field3506[var94 + 1] = var100;
                        boolean var101 = class301.field4799[var94];
                        class301.field4799[var94] = class301.field4799[var94 + 1];
                        class301.field4799[var94 + 1] = var101;
                    }
                }
                if (var93) {
                    break;
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 118) {
            class314.method2221(32);
            class89.field1428 = class80.field1248.method15((byte) -54);
            class60.field884 = -1;
            class142.field2294 = class200.field3060;
            return true;
        } else if (class60.field884 == 16) {
            int var204 = class80.field1248.method56(19612);
            String var205 = class80.field1248.method53(32);
            Object[] var206 = new Object[var205.length() + 1];
            for (int var207 = var205.length() - 1; var207 >= 0; var207--) {
                if (var205.charAt(var207) == 's') {
                    var206[var207 + 1] = class80.field1248.method53(32);
                } else {
                    var206[var207 + 1] = Integer.valueOf(class80.field1248.method33(false));
                }
            }
            var206[0] = Integer.valueOf(class80.field1248.method33(false));
            if (class169.method1263(65535, var204)) {
                class150 var208 = new class150();
                var208.field2450 = var206;
                class172.method1280(var208, (byte) 12);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 176) {
            class111.method867(99);
            class60.field884 = -1;
            return false;
        } else if (class60.field884 == 82) {
            class24.method225(111, true);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 68) {
            class41.field623 = class80.field1248.method15((byte) 102);
            class32.field498 = class80.field1248.method15((byte) 111);
            class270.field4154 = class80.field1248.method15((byte) 73);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 77) {
            int var102 = class80.field1248.method56(19612);
            if (class169.method1263(65535, var102)) {
                class321.method2263(-1);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 213) {
            class321.field5024 = class128.field2060 / 8;
            for (int var103 = 0; var103 < class321.field5024; var103++) {
                class158.field2587[var103] = class80.field1248.method28((byte) -53);
                class197.field3030[var103] = class332.method2332(-31648, class158.field2587[var103]);
                class176.field2817[var103] = false;
            }
            class11.field254 = class200.field3060;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 210) {
            if (class168.field2707 != -1) {
                class79.method618(0, class168.field2707, 26822);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 215) {
            class164.method1233(0);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 150) {
            class92.method730(class80.field1248.method53(arg0 + 16760), 50);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 194) {
            int var200 = class80.field1248.method35(8120);
            int var201 = class80.field1248.method56(arg0 ^ 0xFFFFF234);
            int var202 = class80.field1248.method35(8120);
            int var203 = class80.field1248.method57(103);
            if (class169.method1263(65535, var201)) {
                class73.method585(true, var202, var203, var200);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 9) {
            int var199 = class80.field1248.method62(false);
            class38.field570 = class92.field1484.method557(-11140, var199);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 200) {
            class42.field650 = class200.field3060;
            long var104 = class80.field1248.method28((byte) -53);
            if (var104 == 0L) {
                class174.field2780 = null;
                class60.field884 = -1;
                class32.field495 = null;
                class131.field2105 = 0;
                class160.field2597 = null;
                return true;
            }
            long var106 = class80.field1248.method28((byte) -53);
            class174.field2780 = class65.method520(34, var106);
            class32.field495 = class65.method520(arg0 + 16852, var104);
            class309.field4892 = class80.field1248.method55(4);
            int var108 = class80.field1248.method15((byte) -43);
            if (var108 == 255) {
                class60.field884 = -1;
                return true;
            }
            class131.field2105 = var108;
            class315[] var109 = new class315[100];
            for (int var110 = 0; var110 < class131.field2105; var110++) {
                var109[var110] = new class315();
                var109[var110].field879 = class80.field1248.method28((byte) -53);
                var109[var110].field4976 = class65.method520(-127, var109[var110].field879);
                var109[var110].field4978 = class80.field1248.method56(19612);
                var109[var110].field4972 = class80.field1248.method55(arg0 + 16732);
                var109[var110].field4979 = class80.field1248.method53(32);
                if (class337.field5213 == var109[var110].field879) {
                    class76.field1168 = var109[var110].field4972;
                }
            }
            boolean var111 = false;
            int var112 = class131.field2105;
            while (var112 > 0) {
                var112--;
                boolean var113 = true;
                for (int var114 = 0; var114 < var112; var114++) {
                    if (var109[var114].field4976.compareTo(var109[var114 + 1].field4976) > 0) {
                        class315 var115 = var109[var114];
                        var113 = false;
                        var109[var114] = var109[var114 + 1];
                        var109[var114 + 1] = var115;
                    }
                }
                if (var113) {
                    break;
                }
            }
            class160.field2597 = var109;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 148) {
            class1.field44 = class80.field1248.method15((byte) -18);
            class11.field254 = class200.field3060;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 34) {
            long var116 = class80.field1248.method28((byte) -53);
            int var118 = class80.field1248.method56(19612);
            String var119 = class63.method502(arg0 - 16041, var118).method2291(class80.field1248, 1);
            class115.method901(19, -81, var118, class150.method1134(65, var116), var119, (String) null);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 85) {
            long var120 = class80.field1248.method28((byte) -53);
            String var122 = class205.method1478(class118.method928(class331.method2322(class80.field1248, (byte) -88), arg0 ^ 0xFFFFBEAA));
            class129.method1003(6, var122, class150.method1134(-85, var120), 51);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 226) {
            int var123 = class80.field1248.method3((byte) -117);
            int var124 = class80.field1248.method56(arg0 + 36340);
            int var125 = class80.field1248.method3((byte) -117);
            if (var124 == 65535) {
                var124 = -1;
            }
            String var126 = class80.field1248.method53(arg0 ^ 0xFFFFBE88);
            if (var125 >= 1 && var125 <= 8) {
                if (var126.equalsIgnoreCase("null")) {
                    var126 = null;
                }
                class28.field455[var125 - 1] = var126;
                class62.field913[var125 - 1] = var124;
                class85.field1371[var125 - 1] = var123 == 0;
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 173) {
            int var198 = class80.field1248.method29(15976);
            class82.method645(var198, -18152);
            class259.field3846[class164.method1234(class78.field1217++, 31)] = class164.method1234(var198, 32767);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 28) {
            long var127 = class80.field1248.method28((byte) -53);
            boolean var129 = false;
            int var130 = class80.field1248.method56(19612);
            byte var131 = class80.field1248.method55(4);
            if ((var127 & Long.MIN_VALUE) != 0L) {
                var129 = true;
            }
            if (var129) {
                if (class131.field2105 == 0) {
                    class60.field884 = -1;
                    return true;
                }
                long var137 = var127 & Long.MAX_VALUE;
                boolean var139 = false;
                int var140;
                for (var140 = 0; class131.field2105 > var140 && (class160.field2597[var140].field879 != var137 || class160.field2597[var140].field4978 != var130); var140++) {
                }
                if (class131.field2105 > var140) {
                    while ((class131.field2105 - 1) > var140) {
                        class160.field2597[var140] = class160.field2597[var140 + 1];
                        var140++;
                    }
                    class131.field2105--;
                    class160.field2597[class131.field2105] = null;
                }
            } else {
                String var132 = class80.field1248.method53(arg0 + 16760);
                class315 var133 = new class315();
                var133.field879 = var127;
                var133.field4976 = class65.method520(46, var133.field879);
                var133.field4978 = var130;
                var133.field4979 = var132;
                var133.field4972 = var131;
                int var134;
                for (var134 = class131.field2105 - 1; var134 >= 0; var134--) {
                    int var135 = class160.field2597[var134].field4976.compareTo(var133.field4976);
                    if (var135 == 0) {
                        class160.field2597[var134].field4978 = var130;
                        class160.field2597[var134].field4972 = var131;
                        class160.field2597[var134].field4979 = var132;
                        class60.field884 = -1;
                        class42.field650 = class200.field3060;
                        if (class337.field5213 == var127) {
                            class76.field1168 = var131;
                        }
                        return true;
                    }
                    if (var135 < 0) {
                        break;
                    }
                }
                if (class131.field2105 >= class160.field2597.length) {
                    class60.field884 = -1;
                    return true;
                }
                for (int var136 = class131.field2105 - 1; var136 > var134; var136--) {
                    class160.field2597[var136 + 1] = class160.field2597[var136];
                }
                if (class131.field2105 == 0) {
                    class160.field2597 = new class315[100];
                }
                class160.field2597[var134 + 1] = var133;
                if (class337.field5213 == var127) {
                    class76.field1168 = var131;
                }
                class131.field2105++;
            }
            class42.field650 = class200.field3060;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 48) {
            class24.method225(100, false);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 217) {
            int var141 = class80.field1248.method60((byte) 120);
            int var142 = class80.field1248.method41((byte) -66);
            int var143 = class80.field1248.method58((byte) -78);
            if (class169.method1263(65535, var143)) {
                class80.method628((byte) -94, var141, var142);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 228) {
            class42.field646 = class80.field1248.method15((byte) 68);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 158) {
            int var197 = class80.field1248.method56(19612);
            if (class169.method1263(65535, var197)) {
                class245.method1727(85);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 162) {
            int var193 = class80.field1248.method15((byte) 63);
            int var194 = var193 >> 5;
            int var195 = var193 & 0x1F;
            if (var195 == 0) {
                class62.field912[var194] = null;
                class60.field884 = -1;
                return true;
            }
            class327 var196 = new class327();
            var196.field5113 = var195;
            var196.field5113 = var193 & 0x3F;
            var196.field5120 = class80.field1248.method15((byte) 118);
            if (var196.field5120 >= 0 && class109.field1770.length > var196.field5120) {
                if (var196.field5113 == 1 || var196.field5113 == 10) {
                    var196.field5117 = class80.field1248.method56(19612);
                    class80.field1248.field48 += 5;
                } else if (var196.field5113 >= 2 && var196.field5113 <= 6) {
                    if (var196.field5113 == 2) {
                        var196.field5108 = 64;
                        var196.field5118 = 64;
                    }
                    if (var196.field5113 == 3) {
                        var196.field5118 = 64;
                        var196.field5108 = 0;
                    }
                    if (var196.field5113 == 4) {
                        var196.field5118 = 64;
                        var196.field5108 = 128;
                    }
                    if (var196.field5113 == 5) {
                        var196.field5118 = 0;
                        var196.field5108 = 64;
                    }
                    if (var196.field5113 == 6) {
                        var196.field5118 = 128;
                        var196.field5108 = 64;
                    }
                    var196.field5113 = 2;
                    var196.field5121 = class80.field1248.method56(19612);
                    var196.field5109 = class80.field1248.method56(19612);
                    var196.field5124 = class80.field1248.method15((byte) 106);
                    var196.field5122 = class80.field1248.method56(19612);
                }
                var196.field5112 = class80.field1248.method56(arg0 + 36340);
                if (var196.field5112 == 65535) {
                    var196.field5112 = -1;
                }
                class62.field912[var194] = var196;
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 147) {
            class43.method384(class80.field1248, class92.field1484, class128.field2060, arg0 ^ 0xFFFFA51E);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 208) {
            int var144 = class80.field1248.method56(19612);
            int var145 = class80.field1248.method56(19612);
            int var146 = class80.field1248.method56(19612);
            if (class169.method1263(65535, var144)) {
                class296.method2098(var145, var146, -118);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 195) {
            int var147 = class80.field1248.method56(arg0 ^ 0xFFFFF234);
            int var148 = class80.field1248.method15((byte) -108);
            int var149 = class80.field1248.method15((byte) -105);
            int var150 = class80.field1248.method15((byte) -112);
            int var151 = class80.field1248.method15((byte) 80);
            int var152 = class80.field1248.method56(19612);
            if (class169.method1263(65535, var147)) {
                class41.field637[var148] = true;
                class273.field4268[var148] = var149;
                class281.field4409[var148] = var150;
                class47.field719[var148] = var151;
                class334.field5194[var148] = var152;
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 180) {
            if (class244.field3646 != null) {
                class184.method1342(-1, -1, -1, false, class101.field1636);
            }
            byte[] var191 = new byte[class128.field2060];
            class80.field1248.method1805(var191, class128.field2060, 0, (byte) -2);
            String var192 = class225.method1647(var191, 0, arg0 + 16728, class128.field2060);
            if (class139.field2247 == null && class69.field1039 == 3 || !class69.field1047.startsWith("win") || class144.field2342) {
                class149.method1129(var192, true, (byte) 65);
            } else {
                class255.field3753 = var192;
                class308.field4882 = true;
                class157.field2575 = class92.field1484.method560(var192, false);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 202) {
            class314.method2221(32);
            int var187 = class80.field1248.method15((byte) 71);
            int var188 = class80.field1248.method62(false);
            int var189 = class80.field1248.method15((byte) -46);
            class284.field4437[var187] = var188;
            class213.field3331[var187] = var189;
            class339.field5240[var187] = 1;
            for (int var190 = 0; var190 < 98; var190++) {
                if (var188 >= class190.field2979[var190]) {
                    class339.field5240[var187] = var190 + 2;
                }
            }
            class264.field3915[class164.method1234(31, class39.field600++)] = var187;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 250) {
            int var185 = class80.field1248.method39(arg0 ^ 0x5FE8);
            int var186 = class80.field1248.method60((byte) 125);
            class81.method635((byte) -82, var185, var186);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 64) {
            int var153 = class80.field1248.method19(255);
            int var154 = class80.field1248.method62(false);
            int var155 = class80.field1248.method56(arg0 ^ 0xFFFFF234);
            if (class169.method1263(arg0 ^ 0xFFFF4157, var155)) {
                class195.method1382(var154, var153, true);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 15) {
            int var156 = class80.field1248.method60((byte) 114);
            int var157 = class80.field1248.method56(arg0 ^ 0xFFFFF234);
            if (var157 == 65535) {
                var157 = -1;
            }
            int var158 = class80.field1248.method57(86);
            int var159 = class80.field1248.method58((byte) -78);
            if (var159 == 65535) {
                var159 = -1;
            }
            int var160 = class80.field1248.method39(-7872);
            if (class169.method1263(65535, var160)) {
                for (int var161 = var157; var161 <= var159; var161++) {
                    long var162 = ((long) var156 << 32) + (long) var161;
                    class257 var164 = (class257) class233.field3545.method79(var162, (byte) 0);
                    class257 var165;
                    if (var164 != null) {
                        var165 = new class257(var158, var164.field3807);
                        var164.method489(false);
                    } else if (var161 == -1) {
                        var165 = new class257(var158, class171.method1276(var156, (byte) -122).field3936.field3807);
                    } else {
                        var165 = new class257(var158, -1);
                    }
                    class233.field3545.method75(var165, -1, var162);
                }
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 106) {
            class314.method2221(arg0 + 16760);
            class155.field2532 = class80.field1248.method41((byte) -66);
            class142.field2294 = class200.field3060;
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 154) {
            int var174 = class80.field1248.method3((byte) -117);
            int var175 = var174 >> 2;
            int var176 = var174 & 0x3;
            int var177 = class113.field1830[var175];
            int var178 = class80.field1248.method39(-7872);
            if (var178 == 65535) {
                var178 = -1;
            }
            int var179 = class80.field1248.method60((byte) 103);
            int var180 = var179 >> 28 & 0x3;
            int var181 = (var179 & 0xFFFD74D) >> 14;
            int var182 = var179 & 0x3FFF;
            int var183 = var182 - class133.field2118;
            int var184 = var181 - class117.field1902;
            class99.method805(var183, var175, var176, var180, var184, var178, var177, (byte) 87);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 11) {
            int var166 = class80.field1248.method19(arg0 + 16983);
            int var167 = class80.field1248.method58((byte) -78);
            class81.method635((byte) -93, var167, var166);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 113) {
            int var168 = class80.field1248.method29(15976);
            if (var168 == 65535) {
                var168 = -1;
            }
            int var169 = class80.field1248.method60((byte) 103);
            int var170 = class80.field1248.method58((byte) -78);
            if (class169.method1263(65535, var170)) {
                class308.method2182(-1, 4, var168, 1, var169);
            }
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 136) {
            int var171 = class80.field1248.method33(false);
            class266 var172 = class171.method1276(var171, (byte) 30);
            for (int var173 = 0; var173 < var172.field3928.length; var173++) {
                var172.field3928[var173] = -1;
                var172.field3928[var173] = 0;
            }
            class280.method1971((byte) 101, var172);
            class60.field884 = -1;
            return true;
        } else if (class60.field884 == 186) {
            class60.field884 = -1;
            class57.field862 = 0;
            return true;
        } else {
            class79.method622("T1 - " + class60.field884 + "," + class340.field5248 + "," + class172.field2761 + " - " + class128.field2060, (Throwable) null, arg0 - 652836092);
            class111.method867(61);
            return true;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II[BI)V", line = 3298)
    public final void method433(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field793++;
        try {
            if (arg2.length < (arg0 + arg1)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field783 != -1L && this.field783 <= this.field791 && ((long) this.field768 + this.field783) >= ((long) arg1 + this.field791)) {
                class330.method2315(this.field787, (int) (this.field791 - this.field783), arg2, arg0, arg1);
                this.field791 += (long) arg1;
                return;
            }
            long var5 = this.field791;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field769 <= this.field791 && this.field791 < (this.field769 + ((long) this.field786))) {
                int var9 = (int) ((long) this.field786 + this.field769 - this.field791);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class330.method2315(this.field775, (int) (this.field791 - this.field769), arg2, arg0, var9);
                arg0 += var9;
                this.field791 += (long) var9;
            }
            if (arg3 != 0) {
                return;
            }
            if (this.field775.length < arg1) {
                this.field782.method1831(0, this.field791);
                this.field792 = this.field791;
                while (arg1 > 0) {
                    int var11 = this.field782.method1833(arg1, arg2, arg0, false);
                    if (var11 == -1) {
                        break;
                    }
                    this.field791 += (long) var11;
                    this.field792 += (long) var11;
                    arg0 += var11;
                    arg1 -= var11;
                }
            } else if (arg1 > 0) {
                this.method422(false);
                int var10 = arg1;
                if (this.field786 < arg1) {
                    var10 = this.field786;
                }
                class330.method2315(this.field775, 0, arg2, arg0, var10);
                arg1 -= var10;
                arg0 += var10;
                this.field791 += (long) var10;
            }
            if (this.field783 != -1L) {
                if (this.field783 > this.field791 && arg1 > 0) {
                    int var12 = (int) (this.field783 - this.field791) + arg0;
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field791++;
                    }
                }
                long var13 = -1L;
                if (this.field783 >= var5 && this.field783 < var5 + ((long) var8)) {
                    var13 = this.field783;
                } else if (var5 >= this.field783 && var5 < (long) this.field768 + this.field783) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field783 + ((long) this.field768) && (long) this.field768 + this.field783 <= (long) var8 + var5) {
                    var15 = (long) this.field768 + this.field783;
                } else if (this.field783 < var5 + ((long) var8) && (long) this.field768 + this.field783 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class330.method2315(this.field787, (int) (var13 - this.field783), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field791 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field791));
                        this.field791 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field792 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)J", line = 3484)
    public final long method434(byte arg0) {
        if (arg0 == -63) {
            field784++;
            return this.field789;
        } else {
            return -118L;
        }
    }
}
