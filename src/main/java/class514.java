import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class514 {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
    public static int[] field6951 = new int[2];

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field6956 = 0;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "Lcm;")
    public static class729 field6953 = new class729();

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V", line = 11)
    public static void method2842(byte arg0) {
        field6951 = null;
        field6953 = null;
        if (arg0 != 15) {
            field6953 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method2843(int arg0) {
        field6952++;
        return arg0 <= 90 ? false : class135.field1724 == this | class675.field9436 == this;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)V", line = 39)
    public static final void method2844(byte arg0) {
        if (!class83.field1156) {
            class148.field1903 = class38.field395 != -1 && class38.field395 <= class43.field470 || class512.field6932 < (class43.field470 * 16 + (class527.field7072 ? 26 : 22));
        }
        field6955++;
        class188.field2263.method728((byte) 47);
        class332.field4485.method728((byte) 47);
        for (class227 var1 = (class227) class139.field1783.method724(arg0 ^ 0x11); var1 != null; var1 = (class227) class139.field1783.method723(arg0 + 60)) {
            int var38 = var1.field2948;
            if (var38 < 1000) {
                var1.method315(52);
                if (var38 == 46 || var38 == 50 || var38 == 48 || var38 == 58 || var38 == 5 || var38 == 57 || var38 == 59) {
                    class332.field4485.method725(var1, -20911);
                } else {
                    class188.field2263.method725(var1, arg0 ^ 0xFFFFAE60);
                }
            }
        }
        class188.field2263.method731(class139.field1783, 106);
        class332.field4485.method731(class139.field1783, -90);
        if (class43.field470 <= 1) {
            class736.field10279 = null;
            class761.field10626 = null;
        } else {
            if (class581.field8149 && class290.field3843.method1426(81, arg0 ^ 0x154E) && class43.field470 > 2) {
                class736.field10279 = (class227) class139.field1783.field1438.field557.field557;
            } else {
                class736.field10279 = (class227) class139.field1783.field1438.field557;
            }
            class761.field10626 = (class227) class139.field1783.field1438.field557;
        }
        if (arg0 != 49) {
            method2844((byte) 76);
        }
        int var2 = -1;
        class314 var3 = (class314) class171.field2134.method724(32);
        if (var3 != null) {
            var2 = var3.method1880(-5);
        }
        if (!class83.field1156) {
            if (var2 == 0 && (class760.field10603 == 1 && class43.field470 > 2 || class322.method1921((byte) 127))) {
                var2 = 2;
            }
            if (var2 == 2 && class43.field470 > 0 && var3 != null) {
                if (class72.field774 == null && class259.field3393 == 0) {
                    class372.method2190(var3.method1875(94), var3.method1879(arg0 + 73), true);
                } else {
                    class284.field3756 = 2;
                }
            }
            if (var2 == 0) {
                if (class736.field10279 != null) {
                    class640.method3602(-100);
                } else if (class595.field8291) {
                    class96.method661((byte) 97);
                }
            }
            if (class72.field774 == null && class259.field3393 == 0) {
                class320.field4305 = null;
                class284.field3756 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class427.field6034.method528(25);
            int var5 = class427.field6034.method521((byte) 28);
            boolean var6 = false;
            if (class659.field9197 != null) {
                if (class596.field8309 - 10 <= var4 && (class596.field8309 - (-class438.field6139 - 10)) >= var4 && class746.field10362 - 10 <= var5 && var5 <= (class638.field8859 + class746.field10362 + 10)) {
                    var6 = true;
                } else {
                    class525.method2916(arg0 + 21);
                }
            }
            if (!var6) {
                if (class729.field10174 - 10 > var4 || var4 > class729.field10174 + class33.field341 + 10 || class475.field6566 - 10 > var5 || var5 > (class475.field6566 + class116.field1526 + 10)) {
                    class198.method1096((byte) -53);
                } else if (class148.field1903) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class331.field4464; var9++) {
                        if (class527.field7072) {
                            int var11 = var9 * 16 + class475.field6566 + 33;
                            if (var5 > (var11 - 13) && var5 < (var11 + 4)) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var10 = class475.field6566 + (var9 * 16) + 31;
                            if (var5 > var10 - 13 && var5 < (var10 + 3)) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class195 var13 = new class195(class526.field7066);
                        for (class756 var14 = (class756) var13.method1083(true); var14 != null; var14 = (class756) var13.method1084(0)) {
                            if (var7 == var12) {
                                if (var14.field10556 > 1) {
                                    class376.method2210(var8, var14, true, var5);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1879(124);
        int var16 = var3.method1875(40);
        if (class659.field9197 != null && class596.field8309 <= var15 && var15 <= class596.field8309 + class438.field6139 && class746.field10362 <= var16 && class746.field10362 + class638.field8859 >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class659.field9197.field10556; var18++) {
                if (class527.field7072) {
                    int var22 = var18 * 16 + class746.field10362 + 33;
                    if (var22 - 13 < var16 && (var22 + 4) > var16) {
                        var17 = var18;
                    }
                } else {
                    int var23 = class746.field10362 + (var18 * 16) + 31;
                    if (var16 > (var23 - 13) && var23 + 3 > var16) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class195 var20 = new class195(class659.field9197.field10553);
                for (class227 var21 = (class227) var20.method1083(true); var21 != null; var21 = (class227) var20.method1084(0)) {
                    if (var17 == var19) {
                        class436.method2474(var16, (byte) 78, var15, var21);
                        break;
                    }
                    var19++;
                }
            }
            class198.method1096((byte) -53);
            return;
        }
        if (var15 < class729.field10174 || var15 > class729.field10174 + class33.field341 || var16 < class475.field6566 || var16 > class475.field6566 + class116.field1526) {
            return;
        }
        if (!class148.field1903) {
            int var24 = -1;
            for (int var25 = 0; var25 < class43.field470; var25++) {
                if (class527.field7072) {
                    int var29 = (class43.field470 - var25 - 1) * 16 + (class475.field6566 + 33);
                    if (var16 > (var29 - 13) && var16 < var29 + 4) {
                        var24 = var25;
                    }
                } else {
                    int var30 = (class43.field470 - var25 - 1) * 16 + class475.field6566 + 31;
                    if (var16 > var30 - 13 && var16 < (var30 + 3)) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class192 var27 = new class192(class139.field1783);
                for (class227 var28 = (class227) var27.method1073((byte) -116); var28 != null; var28 = (class227) var27.method1072(1000)) {
                    if (var24 == var26) {
                        class436.method2474(var16, (byte) 78, var15, var28);
                        break;
                    }
                    var26++;
                }
            }
            class198.method1096((byte) -53);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class331.field4464; var32++) {
            if (class527.field7072) {
                int var34 = var32 * 16 + class475.field6566 + 33;
                if (var16 > var34 - 13 && var16 < var34 + 4) {
                    var31 = var32;
                    break;
                }
            } else {
                int var33 = var32 * 16 + class475.field6566 + 31;
                if ((var33 - 13) < var16 && var16 < (var33 + 3)) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class195 var36 = new class195(class526.field7066);
        for (class756 var37 = (class756) var36.method1083(true); var37 != null; var37 = (class756) var36.method1084(0)) {
            if (var31 == var35) {
                class436.method2474(var16, (byte) 78, var15, (class227) var37.field10553.field5735.field5555);
                class198.method1096((byte) -53);
                return;
            }
            var35++;
        }
    }

    @OriginalMember(owner = "client!nga", name = "toString", descriptor = "()Ljava/lang/String;", line = 439)
    public final String toString() {
        field6954++;
        throw new IllegalStateException();
    }
}
