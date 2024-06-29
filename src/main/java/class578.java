import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class578 extends class401 {

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "Lem;")
    public static class206 field8158 = new class206(80, 8);

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "Lin;")
    public static class78 field8165 = null;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "Lem;")
    public static class206 field8164 = new class206(90, -2);

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "F")
    public static float field8166;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "J")
    public long field8154;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "Lvr;")
    public static class121 field8156;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "Lpaa;")
    public class578 field8159;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "Lpaa;")
    public class578 field8163;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "Lsea;")
    public static class648 field8167;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3297(int arg0) {
        if (arg0 != -22998) {
            field8158 = null;
        }
        field8160++;
        class152.method1095(false, true);
        if (class127.field1823 >= 0 && class127.field1823 != 0) {
            class203.method1327((byte) 63, class127.field1823);
            class127.field1823 = -1;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V", line = 25)
    public static void method3298(byte arg0) {
        field8156 = null;
        field8167 = null;
        field8158 = null;
        field8164 = null;
        if (arg0 != 33) {
            method3298((byte) -60);
        }
        field8165 = null;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)V", line = 49)
    public static final void method3299(boolean arg0) {
        field8162++;
        class435.field6051.method1444(-27547);
        class41.field476.method1444(-27547);
        for (class499 var1 = (class499) class588.field8265.method1436(28964); var1 != null; var1 = (class499) class588.field8265.method1443((byte) 6)) {
            int var18 = var1.field6780;
            if (var18 < 1000) {
                var1.method2340(92);
                if (var18 == 9 || var18 == 59 || var18 == 22 || var18 == 44 || var18 == 21 || var18 == 12 || var18 == 45) {
                    class41.field476.method1441(var1, 0);
                } else {
                    class435.field6051.method1441(var1, 0);
                }
            }
        }
        class435.field6051.method1445(-2788, class588.field8265);
        if (arg0) {
            method3298((byte) 102);
        }
        class41.field476.method1445(-2788, class588.field8265);
        if (class137.field1948 <= 1) {
            class84.field1244 = null;
        } else if (class367.field4945 && class353.field4698.method34(81, -16215) && class137.field1948 > 2) {
            class84.field1244 = (class499) class588.field8265.field3151.field5621.field5621;
        } else {
            class84.field1244 = (class499) class588.field8265.field3151.field5621;
        }
        int var2 = -1;
        class639 var3 = (class639) class508.field6960.method1436(28964);
        if (var3 != null) {
            var2 = var3.method1013(731);
        }
        if (!class541.field7327) {
            if (var2 == 0 && (class141.field2008 == 1 && class137.field1948 > 2 || class116.method828(1006094723))) {
                var2 = 2;
            }
            if (var2 == 2 && class137.field1948 > 0 && var3 != null) {
                if (class396.field5579 == null && class614.field8574 == 0) {
                    class285.method1753(var3.method1014(false), var3.method1010(-85), -100);
                } else {
                    class570.field8101 = 2;
                }
            }
            if (var2 == 0 && class137.field1948 > 0) {
                class367.method2118((byte) -115);
            }
            if (class396.field5579 == null && class614.field8574 == 0) {
                class43.field518 = null;
                class570.field8101 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class214.field2991.method1499(8);
            int var5 = class214.field2991.method1491((byte) 108);
            if (class603.field8403 - 10 > var4 || var4 > (class603.field8403 + class568.field8040 + 10) || (class627.field8692 - 10) > var5 || (class627.field8692 + class426.field5970 + 10) < var5) {
                class592.method3352(-15934);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class603.field8403;
        int var7 = class627.field8692;
        int var8 = class568.field8040;
        int var9 = var3.method1014(false);
        int var10 = var3.method1010(-100);
        int var11 = -1;
        for (int var12 = 0; var12 < class137.field1948; var12++) {
            if (class287.field3951) {
                int var16 = (class137.field1948 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && (var6 + var8) > var9 && var10 > var16 - 13 && (var16 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class137.field1948 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var17 - 13 < var10 && var10 < (var17 + 3)) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class666 var14 = new class666(class588.field8265);
            for (class499 var15 = (class499) var14.method3765(-1968); var15 != null; var15 = (class499) var14.method3764(-21495)) {
                if (var11 == var13) {
                    class624.method3467(var10, var9, 0, var15);
                }
                var13++;
            }
        }
        class592.method3352(-15934);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "([Ltu;Ltba;Z)Lgda;", line = 220)
    public static final class50 method3300(class318[] arg0, class147 arg1, boolean arg2) {
        field8161++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field4360 <= 0L) {
                return null;
            }
        }
        if (arg2) {
            return null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field4360);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class385.field5459, 0);
        if (class385.field5459[0] == 0) {
            if (class385.field5459[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class385.field5459, 1);
            if (class385.field5459[1] > 1) {
                byte[] var7 = new byte[class385.field5459[1]];
                OpenGL.glGetInfoLogARB(var4, class385.field5459[1], class385.field5459, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class385.field5459[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field4360);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class50(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V", line = 293)
    public final void method3301(int arg0) {
        if (arg0 <= 39) {
            field8156 = null;
        }
        field8157++;
        if (this.field8159 != null) {
            this.field8159.field8163 = this.field8163;
            this.field8163.field8159 = this.field8159;
            this.field8163 = null;
            this.field8159 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)Z", line = 320)
    public final boolean method3302(int arg0) {
        field8155++;
        if (arg0 == 0) {
            return this.field8159 != null;
        } else {
            return true;
        }
    }
}
