import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class112 extends class578 {

    @OriginalMember(owner = "client!qea", name = "A", descriptor = "I")
    public int field1547 = 12800;

    @OriginalMember(owner = "client!qea", name = "E", descriptor = "Z")
    public boolean field1551 = true;

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
    public int field1545 = 0;

    @OriginalMember(owner = "client!qea", name = "G", descriptor = "I")
    public int field1553 = -1;

    @OriginalMember(owner = "client!qea", name = "Q", descriptor = "I")
    public int field1562 = 12800;

    @OriginalMember(owner = "client!qea", name = "B", descriptor = "I")
    public int field1548 = -1;

    @OriginalMember(owner = "client!qea", name = "H", descriptor = "I")
    public int field1554 = 0;

    @OriginalMember(owner = "client!qea", name = "D", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!qea", name = "O", descriptor = "Ljava/lang/String;")
    public String field1560;

    @OriginalMember(owner = "client!qea", name = "M", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!qea", name = "L", descriptor = "Ljava/lang/String;")
    public String field1557;

    @OriginalMember(owner = "client!qea", name = "P", descriptor = "Lgca;")
    public class227 field1561;

    @OriginalMember(owner = "client!qea", name = "C", descriptor = "I")
    public static int field1549 = 0;

    @OriginalMember(owner = "client!qea", name = "x", descriptor = "Ltb;")
    public static class365 field1544 = new class365();

    @OriginalMember(owner = "client!qea", name = "R", descriptor = "I")
    public static int field1563 = -1;

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!qea", name = "F", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!qea", name = "I", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!qea", name = "J", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!qea", name = "N", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!qea", name = "S", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V", line = 4)
    public final void method808(byte arg0) {
        this.field1547 = 12800;
        this.field1545 = 0;
        this.field1554 = 0;
        this.field1562 = 12800;
        field1555++;
        if (arg0 < 61) {
            method809(116, null, true, null);
        }
        for (class48 var2 = (class48) this.field1561.method1436(28964); var2 != null; var2 = (class48) this.field1561.method1443((byte) 6)) {
            if (var2.field575 < this.field1547) {
                this.field1547 = var2.field575;
            }
            if (this.field1545 < var2.field563) {
                this.field1545 = var2.field563;
            }
            if (var2.field574 > this.field1554) {
                this.field1554 = var2.field574;
            }
            if (var2.field557 < this.field1562) {
                this.field1562 = var2.field557;
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILlaa;ZLac;)V", line = 40)
    public static final void method809(int arg0, class105 arg1, boolean arg2, class501 arg3) {
        field1564++;
        class251 var4 = new class251();
        var4.field3426 = arg3.method2874((byte) -75);
        var4.field3428 = arg3.method2840(arg2);
        var4.field3430 = new int[var4.field3426];
        var4.field3431 = new byte[var4.field3426][][];
        var4.field3420 = new class70[var4.field3426];
        var4.field3427 = new int[var4.field3426];
        var4.field3432 = new int[var4.field3426];
        var4.field3429 = new class70[var4.field3426];
        for (int var5 = 0; var5 < var4.field3426; var5++) {
            try {
                int var6 = arg3.method2874((byte) -75);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method2851((byte) -81);
                    String var18 = arg3.method2851((byte) -100);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method2840(arg2);
                    }
                    var4.field3432[var5] = var6;
                    var4.field3427[var5] = var19;
                    var4.field3420[var5] = arg1.method762(class24.method239(!arg2, var17), 106, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method2851((byte) -70);
                    String var8 = arg3.method2851((byte) -80);
                    int var9 = arg3.method2874((byte) -75);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method2851((byte) -86);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method2840(arg2);
                            var12[var13] = new byte[var14];
                            arg3.method2857(var12[var13], var14, (byte) 125, 0);
                        }
                    }
                    var4.field3432[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class24.method239(true, var10[var16]);
                    }
                    var4.field3429[var5] = arg1.method772(8, var8, var15, class24.method239(true, var7));
                    var4.field3431[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3430[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3430[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3430[var5] = -3;
            } catch (Exception var23) {
                var4.field3430[var5] = -4;
            } catch (Throwable var24) {
                var4.field3430[var5] = -5;
            }
        }
        class341.field4566.method1441(var4, 0);
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 313)
    public class112(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1548 = arg4;
        this.field1550 = arg0;
        this.field1551 = arg5;
        this.field1560 = arg2;
        this.field1558 = arg3;
        this.field1557 = arg1;
        this.field1553 = arg6;
        if (this.field1553 == 255) {
            this.field1553 = 0;
        }
        this.field1561 = new class227();
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([IIII)Z", line = 162)
    public final boolean method810(int[] arg0, int arg1, int arg2, int arg3) {
        field1559++;
        if (arg2 != -1) {
            return false;
        }
        for (class48 var5 = (class48) this.field1561.method1436(28964); var5 != null; var5 = (class48) this.field1561.method1443((byte) 6)) {
            if (var5.method388(arg2 + 8160, arg1, arg3)) {
                var5.method392(arg1, arg0, arg2 ^ 0xFFFF8288, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([IIIZ)Z", line = 190)
    public final boolean method811(int[] arg0, int arg1, int arg2, boolean arg3) {
        field1546++;
        for (class48 var5 = (class48) this.field1561.method1436(28964); var5 != null; var5 = (class48) this.field1561.method1443((byte) 6)) {
            if (var5.method389((byte) -53, arg1, arg2)) {
                var5.method390(arg0, (byte) 68, arg1, arg2);
                return true;
            }
        }
        if (arg3) {
            field1549 = -95;
        }
        return false;
    }

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "(I)V", line = 219)
    public static void method812(int arg0) {
        field1544 = null;
        if (arg0 != 12800) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)Z", line = 243)
    public final boolean method813(int arg0, int arg1, int arg2) {
        field1552++;
        for (class48 var4 = (class48) this.field1561.method1436(28964); var4 != null; var4 = (class48) this.field1561.method1443((byte) 6)) {
            if (var4.method389((byte) -108, arg0, arg2)) {
                return true;
            }
        }
        if (arg1 != 3134) {
            this.method810(null, 41, 124, 11);
        }
        return false;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(II[III)Z", line = 282)
    public final boolean method814(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field1556++;
        if (arg4 != -1) {
            field1544 = null;
        }
        for (class48 var6 = (class48) this.field1561.method1436(28964); var6 != null; var6 = (class48) this.field1561.method1443((byte) 6)) {
            if (var6.method387(arg0, arg3, (byte) -105, arg1)) {
                var6.method390(arg2, (byte) 68, arg0, arg3);
                return true;
            }
        }
        return false;
    }
}
