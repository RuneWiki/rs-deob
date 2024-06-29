import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 extends class28 {

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    private final int field18;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    private final int field23;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private final int field22;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private final int field28;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "Lhi;")
    public static class82 field31 = class95.method664((byte) -126, "<col=ff3000>");

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "[Lhi;")
    public static class82[] field21;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[Lme;B)V", line = 6)
    public static final void method19(int arg0, class75[] arg1, byte arg2) {
        if (arg2 <= 81) {
            method20((byte) 94);
        }
        field19++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class75 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1184 == 0) {
                    if (var4.field1274 != null) {
                        method19(arg0, var4.field1274, (byte) 109);
                    }
                    class146 var5 = (class146) class191.field3195.method507((long) var4.field1172, 602425312);
                    if (var5 != null) {
                        class143.method976(var5.field2474, 256, arg0);
                    }
                }
                if (arg0 == 0 && var4.field1243 != null) {
                    class331 var6 = new class331();
                    var6.field5649 = var4;
                    var6.field5635 = var4.field1243;
                    class15.method92(var6, 87);
                }
                if (arg0 == 1 && var4.field1253 != null) {
                    if (var4.field1238 >= 0) {
                        class75 var7 = class282.method1965(var4.field1172, (byte) 6);
                        if (var7 == null || var7.field1274 == null || var4.field1238 >= var7.field1274.length || var7.field1274[var4.field1238] != var4) {
                            continue;
                        }
                    }
                    class331 var8 = new class331();
                    var8.field5635 = var4.field1253;
                    var8.field5649 = var4;
                    class15.method92(var8, 82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIII)V", line = 86)
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field18 = arg3;
        this.field23 = arg1;
        this.field22 = arg2;
        this.field28 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 101)
    public static void method20(byte arg0) {
        field31 = null;
        field21 = null;
        if (arg0 != -58) {
            method20((byte) -125);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Lrd;", line = 117)
    public static final class139 method21(int arg0) {
        if (arg0 >= -123) {
            return (class139) null;
        }
        field27++;
        try {
            return (class139) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(III)V", line = 132)
    public final void method22(int arg0, int arg1, int arg2) {
        if (arg2 < 24) {
            this.method26(45, 49, 4);
        }
        field30++;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 142)
    public static final void method23(int arg0) {
        if (arg0 != 286013516) {
            field21 = (class82[]) null;
        }
        class260.field4453 = (byte[][]) null;
        field24++;
        class86.field1536 = null;
        class107.field1897 = null;
        class142.field2427 = null;
        class42.field747 = null;
        class20.field262 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)V", line = 166)
    public final void method24(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field31 = (class82) null;
        }
        field20++;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)Ljm;", line = 176)
    public static final class303 method25(byte arg0) {
        if (arg0 != -35) {
            field21 = (class82[]) null;
        }
        int var1 = class42.field747[0] * class107.field1897[0];
        field29++;
        byte[] var2 = class260.field4453[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class142.field2427[class277.method1935(255, var2[var4])];
        }
        class303 var5 = new class303(class285.field4793, class28.field381, class86.field1536[0], class20.field262[0], class107.field1897[0], class42.field747[0], var3);
        method23(286013516);
        return var5;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(III)V", line = 210)
    public final void method26(int arg0, int arg1, int arg2) {
        field25++;
        if (arg2 != 0) {
            method21(-41);
        }
        int var4 = this.field22 * arg1 >> 12;
        int var5 = this.field28 * arg1 >> 12;
        int var6 = this.field18 * arg0 >> 12;
        int var7 = this.field23 * arg0 >> 12;
        class34.method265(var5, var6, var4, this.field370, var7, -779049524);
    }
}
