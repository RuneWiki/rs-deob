import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class361 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    private int field5243 = -1;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lqw;")
    private class84 field5246 = new class84();

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "J")
    private long field5242;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[[B")
    public static byte[][] field5245;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I", line = 14)
    public static final int method2285(int arg0, int arg1, int arg2) {
        field5244++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (arg2 != -3) {
            method2287(-86);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 39)
    public static void method2286(int arg0) {
        int var1 = 30 / ((-arg0 - 44) / 39);
        field5245 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 51)
    public static final void method2287(int arg0) {
        int var1 = 97 / ((arg0 - 68) / 45);
        field5248++;
        class623.method3437((long) class572.field7788, class375.field5490, (byte) -100);
        if (class227.field2935 != -1) {
            class451.method2681(-8163, class227.field2935);
        }
        for (int var2 = 0; var2 < class689.field9209; var2++) {
            if (class753.field10199[var2]) {
                class600.field8182[var2] = true;
            }
            class261.field3864[var2] = class753.field10199[var2];
            class753.field10199[var2] = false;
        }
        class535.field7423 = class572.field7788;
        if (class227.field2935 != -1) {
            class689.field9209 = 0;
            class411.method2469(3);
        }
        class375.field5490.method526();
        class132.method936((byte) -42, class375.field5490);
        int var3 = class272.method1803(33);
        if (var3 == -1) {
            var3 = class2.field22;
        }
        if (var3 == -1) {
            var3 = class744.field10055;
        }
        class137.method952(var3, (byte) -29);
        class643.field8659 = 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIIII)V", line = 102)
    public static final void method2288(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field5241++;
        if (arg2 <= 116) {
            return;
        }
        int var7 = arg5 - arg6;
        int var8 = arg0 + arg6;
        for (int var9 = arg0; var9 < var8; var9++) {
            class464.method2733(arg4, arg3, arg1, -22816, class228.field2951[var9]);
        }
        int var10 = arg1 - arg6;
        int var11 = arg3 + arg6;
        for (int var12 = arg5; var12 > var7; var12--) {
            class464.method2733(arg4, arg3, arg1, -22816, class228.field2951[var12]);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class228.field2951[var13];
            class464.method2733(arg4, arg3, var11, -22816, var14);
            class464.method2733(arg4, var10, arg1, -22816, var14);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ltn;I)V", line = 148)
    public final void method2289(class95 arg0, int arg1) {
        field5240++;
        if (this.field5242 != arg0.field1366 || this.field5243 != arg0.field1362) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class404.method2444(-124, arg0.field1366) + " updateNum:" + arg0.field1362 + " delta.owner:" + class404.method2444(-125, this.field5242) + " updateNum:" + this.field5243);
        }
        for (class557 var3 = (class557) this.field5246.method679((byte) -86); var3 != null; var3 = (class557) this.field5246.method681(arg1 - 12345702)) {
            var3.method32(arg0, -29265);
        }
        arg0.field1362++;
        if (arg1 != 12345678) {
            this.field5246 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ldt;)V", line = 260)
    public class361(class254 arg0) {
        this.method2290(arg0, (byte) -21);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ldt;B)V", line = 180)
    private final void method2290(class254 arg0, byte arg1) {
        field5247++;
        this.field5242 = arg0.method1723(21795);
        this.field5243 = arg0.method1672(arg1 ^ 0x4097);
        if (arg1 != -21) {
            this.method2289(null, -45);
        }
        for (int var3 = arg0.method1731((byte) 64); var3 != 0; var3 = arg0.method1731((byte) 64)) {
            if (class72.field979) {
                System.out.println("t:" + var3);
            }
            class557 var4;
            if (var3 == 3) {
                var4 = new class438();
            } else if (var3 == 1) {
                var4 = new class5();
            } else if (var3 == 4) {
                var4 = new class664();
            } else if (var3 == 6) {
                var4 = new class267();
            } else if (var3 == 5) {
                var4 = new class446();
            } else if (var3 == 2) {
                var4 = new class649();
            } else if (var3 == 7) {
                var4 = new class394();
            } else if (var3 == 8) {
                var4 = new class524();
            } else if (var3 == 9) {
                var4 = new class38();
            } else if (var3 == 10) {
                var4 = new class568();
            } else if (var3 == 11) {
                var4 = new class275();
            } else if (var3 == 12) {
                var4 = new class562();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var4.method30((byte) 110, arg0);
            this.field5246.method689(var4, 101);
        }
    }
}
