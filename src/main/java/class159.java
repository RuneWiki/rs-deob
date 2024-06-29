import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class159 {

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Z")
    public boolean field2196 = false;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field2194 = 128;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    private int field2188 = 0;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
    public boolean field2199 = false;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public int field2205 = -1;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    private int field2206 = 128;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    private int field2204 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    private int field2187 = 0;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lii;")
    public static class227 field2190 = new class227(64);

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2201 = "Started 3d Library";

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[S")
    private short[] field2189;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[S")
    private short[] field2192;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[S")
    private short[] field2197;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[S")
    private short[] field2202;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lp;I)Ll;", line = 5)
    public static final class311 method1053(class107 arg0, int arg1) {
        if (arg1 == 1) {
            field2203++;
            return new class311(arg0.method656(-111), arg0.method656(-89), arg0.method656(72), arg0.method656(-65), arg0.method622((byte) 103), arg0.method622((byte) -23), arg0.method661(-1));
        } else {
            return (class311) null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)Luc;", line = 23)
    public final class201 method1054(int arg0, int arg1, int arg2, int arg3) {
        field2195++;
        if (arg2 != 3899) {
            return (class201) null;
        }
        class201 var5 = (class201) class191.field2748.method1239((byte) -13, (long) this.field2198);
        if (var5 == null) {
            class207 var6 = class207.method1414(class316.field4877, this.field2193, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2189 != null) {
                for (int var7 = 0; var7 < this.field2189.length; var7++) {
                    var6.method1409(this.field2189[var7], this.field2192[var7]);
                }
            }
            if (this.field2202 != null) {
                for (int var8 = 0; var8 < this.field2202.length; var8++) {
                    var6.method1416(this.field2202[var8], this.field2197[var8]);
                }
            }
            var5 = var6.method1407(this.field2188 + 64, this.field2187 + 850, -30, -50, -30);
            class191.field2748.method1243(var5, (long) this.field2198, -29282);
        }
        class201 var9;
        if (this.field2205 == -1 || arg1 == -1) {
            var9 = var5.method707(true, true, true);
        } else {
            var9 = class185.method1289(this.field2205, (byte) 115).method1774(var5, (byte) -75, arg3, arg1, arg0);
        }
        if (this.field2206 != 128 || this.field2194 != 128) {
            var9.method740(this.field2206, this.field2194, this.field2206);
        }
        if (this.field2204 != 0) {
            if (this.field2204 == 90) {
                var9.method738();
            }
            if (this.field2204 == 180) {
                var9.method704();
            }
            if (this.field2204 == 270) {
                var9.method689();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Lda;", line = 99)
    public static final class128 method1055(byte arg0, int arg1) {
        field2200++;
        if (arg1 == 0) {
            return new class148();
        } else if (arg1 == 1) {
            return new class152();
        } else if (arg1 == 2) {
            return new class76();
        } else if (arg1 == 3) {
            return new class150();
        } else if (arg1 == 4) {
            return new class285();
        } else if (arg1 == 5) {
            return new class56();
        } else if (arg1 == 6) {
            return new class85();
        } else if (arg1 == 7) {
            return new class303();
        } else if (arg1 == 8) {
            return new class59();
        } else if (arg1 == 9) {
            return new class323();
        } else if (arg1 == 10) {
            return new class258();
        } else if (arg1 == 11) {
            return new class140();
        } else if (arg1 == 12) {
            return new class223();
        } else if (arg1 == 13) {
            return new class229();
        } else if (arg1 == 14) {
            return new class304();
        } else if (arg1 == 15) {
            return new class257();
        } else if (arg1 == 16) {
            return new class68();
        } else if (arg1 == 17) {
            return new class162();
        } else if (arg1 == 18) {
            return new class261();
        } else if (arg1 == 19) {
            return new class21();
        } else if (arg1 == 20) {
            return new class208();
        } else if (arg1 == 21) {
            return new class279();
        } else if (arg1 == 22) {
            return new class299();
        } else if (arg1 == 23) {
            return new class195();
        } else if (arg1 == 24) {
            return new class331();
        } else if (arg1 == 25) {
            return new class15();
        } else if (arg1 == 26) {
            return new class78();
        } else if (arg1 == 27) {
            return new class38();
        } else if (arg1 == 28) {
            return new class244();
        } else if (arg1 == 29) {
            return new class335();
        } else if (arg1 == 30) {
            return new class328();
        } else if (arg1 == 31) {
            return new class206();
        } else if (arg1 == 32) {
            return new class72();
        } else if (arg1 == 33) {
            return new class19();
        } else if (arg1 == 34) {
            return new class217();
        } else if (arg1 == 35) {
            return new class313();
        } else if (arg1 == 36) {
            return new class280();
        } else if (arg1 == 37) {
            return new class255();
        } else if (arg1 == 38) {
            return new class73();
        } else if (arg1 == 39) {
            return new class329();
        } else {
            int var3 = 0 % ((-arg0 - 56) / 45);
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 418)
    public static void method1056(byte arg0) {
        int var1 = 53 / ((arg0 - 82) / 35);
        field2201 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILp;)V", line = 472)
    private final void method1057(int arg0, int arg1, class107 arg2) {
        if (arg0 == 1) {
            this.field2193 = arg2.method624(14612);
        } else if (arg0 == 2) {
            this.field2205 = arg2.method624(14612);
        } else if (arg0 == 4) {
            this.field2206 = arg2.method624(14612);
        } else if (arg0 == 5) {
            this.field2194 = arg2.method624(14612);
        } else if (arg0 == 6) {
            this.field2204 = arg2.method624(14612);
        } else if (arg0 == 7) {
            this.field2188 = arg2.method661(-1);
        } else if (arg0 == 8) {
            this.field2187 = arg2.method661(-1);
        } else if (arg0 == 9) {
            this.field2199 = true;
        } else if (arg0 == 10) {
            this.field2196 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method661(-1);
            this.field2192 = new short[var6];
            this.field2189 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2189[var7] = (short) arg2.method624(14612);
                this.field2192[var7] = (short) arg2.method624(14612);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method661(-1);
            this.field2202 = new short[var4];
            this.field2197 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2202[var5] = (short) arg2.method624(14612);
                this.field2197[var5] = (short) arg2.method624(14612);
            }
        }
        if (arg1 < 70) {
            this.field2189 = (short[]) null;
        }
        field2207++;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lp;I)V", line = 563)
    public final void method1058(class107 arg0, int arg1) {
        field2191++;
        while (true) {
            int var3 = arg0.method661(-1);
            if (var3 == 0) {
                if (arg1 > -11) {
                    this.field2204 = -107;
                }
                return;
            }
            this.method1057(var3, 100, arg0);
        }
    }
}
