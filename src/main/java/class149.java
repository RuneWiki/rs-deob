import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class149 extends class222 {

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Z")
    public static boolean field2581 = false;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)Lkh;")
    public static final class7 method1002(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class7 var4 = var3.field3022;
            var3.field3022 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public static final void method1003(int arg0, int arg1) {
        class129.field2302.method831(arg0, -123);
        int var2 = 108 % ((-arg1 - 22) / 57);
        field2578++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLmb;Lmb;)V")
    public static final void method1004(boolean arg0, class178 arg1, class178 arg2) {
        field2574++;
        if (arg0) {
            method1009(48, -4, -94, -79, 31, 84, -96, -43);
        }
        class82.field1594 = arg1;
        class13.field247 = arg2;
        class103.field1919 = class13.field247.method1220((byte) -63, 3);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JI)V")
    public static final void method1005(long arg0, int arg1) {
        field2577++;
        if (arg0 == 0L) {
            return;
        }
        if (class185.field3215 >= 100) {
            class197.method1317(-75, 0, class136.field2437, class17.field378);
            return;
        }
        class257 var3 = class199.method1334((byte) -91, arg0).method1717(-108);
        for (int var4 = 0; var4 < class185.field3215; var4++) {
            if (class175.field2981[var4] == arg0) {
                class197.method1317(-25, 0, class233.method1528(new class257[] { var3, class118.field2117 }, 0), class17.field378);
                return;
            }
        }
        for (int var5 = 0; var5 < class138.field2462; var5++) {
            if (class243.field4216[var5] == arg0) {
                class197.method1317(-52, 0, class233.method1528(new class257[] { class138.field2470, var3, class38.field744 }, 0), class17.field378);
                return;
            }
        }
        if (var3.method1706(class137.field2441.field3140, -1)) {
            class197.method1317(-56, 0, class160.field2810, class17.field378);
            return;
        }
        class175.field2981[class185.field3215] = arg0;
        class221.field3743[class185.field3215++] = class199.method1334((byte) -122, arg0);
        class68.field1367++;
        int var6 = 80 / ((arg1 + 13) / 42);
        class188.field3252 = class111.field2038;
        class205.field3524.method908(false, 74);
        class205.field3524.method1044(false, arg0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static final void method1006(byte arg0) {
        field2582++;
        if (arg0 >= -105) {
            method1009(-110, -41, 12, 35, 6, -99, -113, -111);
        }
        class151.field2593.method833(0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLia;)Z")
    public static final boolean method1007(byte arg0, class257 arg1) {
        field2583++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -96) {
            method1009(-42, -50, 48, 43, 80, -118, -40, -114);
        }
        for (int var2 = 0; var2 < class138.field2462; var2++) {
            if (arg1.method1681((byte) -105, class185.field3218[var2])) {
                return true;
            }
        }
        return arg1.method1681((byte) -124, class137.field2441.field3140);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1008(int arg0, Component arg1) {
        field2579++;
        Method var2 = class100.field1837;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class27.field524);
        arg1.addFocusListener(class27.field524);
        int var3 = 53 % ((arg0 + 38) / 58);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2580++;
        int var8 = -49 % ((-arg1 - 55) / 61);
        int var9 = class34.method290(class255.field4371, arg6, class40.field834, -256);
        int var10 = class34.method290(class255.field4371, arg3, class40.field834, -256);
        int var11 = class34.method290(class145.field2540, arg5, class123.field2211, -256);
        int var12 = class34.method290(class145.field2540, arg2, class123.field2211, -256);
        int var13 = class34.method290(class255.field4371, arg6 + arg0, class40.field834, -256);
        int var14 = class34.method290(class255.field4371, arg3 - arg0, class40.field834, -256);
        for (int var15 = var9; var15 < var13; var15++) {
            class94.method692(class185.field3220[var15], (byte) -126, var11, arg4, var12);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class94.method692(class185.field3220[var16], (byte) 36, var11, arg4, var12);
        }
        int var17 = class34.method290(class145.field2540, arg0 + arg5, class123.field2211, -256);
        int var18 = class34.method290(class145.field2540, arg2 - arg0, class123.field2211, -256);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class185.field3220[var19];
            class94.method692(var20, (byte) -125, var11, arg4, var17);
            class94.method692(var20, (byte) 10, var17, arg7, var18);
            class94.method692(var20, (byte) -7, var18, arg4, var12);
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static final void method1010(int arg0) {
        field2576++;
        class21.field442 = null;
        class2.field64 = null;
        class228.field3832 = null;
        class94.field1770 = null;
        class164.field2869 = null;
        class131.field2346 = null;
        class58.field1236 = null;
        if (arg0 != 0) {
            method1010(108);
        }
        class162.field2837 = null;
        class102.field1898 = null;
        class33.field637 = null;
        class185.field3216 = null;
    }
}
