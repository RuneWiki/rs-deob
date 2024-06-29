import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class359 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    private int field4589;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[[Z")
    public static boolean[][] field4594;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IC)V", line = 3)
    public final void method2021(int arg0, char arg1) {
        if (arg0 >= -40) {
            method2026(-21);
        }
        OpenGL.glCallList(this.field4589 + arg1);
        field4593++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 14)
    public final void method2022(int arg0) {
        field4592++;
        if (arg0 != 0) {
            this.field4589 = 68;
        }
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIIIII)V", line = 26)
    public static final void method2023(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4590++;
        if (arg1 != 32) {
            method2023(28, (byte) -37, 120, 50, -18, -62, 2);
        }
        if (class490.field6592 <= arg3 && class116.field1628 >= arg6 && arg5 >= class675.field9512 && class395.field5484 >= arg2) {
            if (arg4 == 1) {
                class363.method2041(arg5, arg0, arg2, 0, arg6, arg3);
            } else {
                class623.method3647((byte) -114, arg5, arg0, arg3, arg4, arg6, arg2);
            }
        } else if (arg4 == 1) {
            class28.method207(arg2, arg0, arg3, arg5, arg6, arg1 + 41);
        } else {
            class10.method46(arg5, true, arg3, arg0, arg2, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V", line = 62)
    public final void method2024(int arg0, int arg1) {
        field4588++;
        OpenGL.glNewList(this.field4589 + arg0, 4864);
        if (arg1 <= 49) {
            method2023(-64, (byte) -91, 43, -96, 3, -74, 90);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILha;Lwu;)V", line = 75)
    public static final void method2025(int arg0, class545 arg1, class557 arg2) {
        field4587++;
        class320[] var3 = class320.method1860(arg2, class365.field4673, 0);
        class405.field5621 = new class21[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class405.field5621[var4] = arg1.method2126(var3[var4], true);
        }
        class320[] var5 = class320.method1860(arg2, class80.field1102, 0);
        class631.field8998 = new class21[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class631.field8998[var6] = arg1.method2126(var5[var6], true);
        }
        class320[] var7 = class320.method1860(arg2, class545.field7707, 0);
        class585.field8423 = new class21[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class585.field8423[var8] = arg1.method2126(var7[var8], true);
        }
        class320[] var9 = class320.method1860(arg2, class42.field590, 0);
        class175.field2385 = new class21[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class175.field2385[var10] = arg1.method2126(var9[var10], true);
        }
        class320[] var11 = class320.method1860(arg2, class453.field6243, 0);
        class604.field8629 = new class21[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class604.field8629[var12] = arg1.method2126(var11[var12], true);
        }
        class320[] var13 = class320.method1860(arg2, class636.field9046, 0);
        class370.field4731 = new class21[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class370.field4731[var14] = arg1.method2126(var13[var14], true);
        }
        class320[] var15 = class320.method1860(arg2, class622.field8851, 0);
        class611.field8687 = new class21[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class611.field8687[var16] = arg1.method2126(var15[var16], true);
        }
        class320[] var17 = class320.method1860(arg2, class586.field8434, 0);
        class72.field1012 = new class21[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class72.field1012[var18] = arg1.method2126(var17[var18], true);
        }
        class320[] var19 = class320.method1860(arg2, class18.field231, 0);
        class519.field7238 = new class21[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class519.field7238[var20] = arg1.method2126(var19[var20], true);
        }
        class320[] var21 = class320.method1860(arg2, class529.field7402, 0);
        class548.field7728 = new class21[var21.length];
        if (arg0 != -2301) {
            return;
        }
        for (int var22 = 0; var22 < var21.length; var22++) {
            class548.field7728[var22] = arg1.method2126(var21[var22], true);
        }
        class320[] var23 = class320.method1860(arg2, class293.field3831, 0);
        class132.field1790 = new class21[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class132.field1790[var24] = arg1.method2126(var23[var24], true);
        }
        class320[] var25 = class320.method1860(arg2, class687.field9634, 0);
        class209.field2979 = new class21[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class209.field2979[var26] = arg1.method2126(var25[var26], true);
        }
        class101.field1452 = arg1.method2126(class320.method1870(arg2, class405.field5623, 0), true);
        class575.field8113 = arg1.method2126(class320.method1870(arg2, class504.field7059, 0), true);
        class320[] var27 = class320.method1860(arg2, class390.field5436, 0);
        class488.field6573 = new class21[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class488.field6573[var28] = arg1.method2126(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 205)
    public static void method2026(int arg0) {
        field4594 = null;
        if (arg0 != 0) {
            field4594 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lwu;I)V", line = 218)
    public static final void method2027(class557 arg0, int arg1) {
        class661.field9333 = arg0.method3311((byte) -24, "p11_full");
        if (arg1 != 0) {
            field4594 = null;
        }
        field4591++;
        class688.field9641 = arg0.method3311((byte) -24, "p12_full");
        class574.field8108 = arg0.method3311((byte) -24, "b12_full");
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lep;I)V", line = 231)
    public class359(class371 arg0, int arg1) {
        this.field4589 = OpenGL.glGenLists(arg1);
    }
}
