import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class class281 extends class435 {

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    public static boolean field3720 = true;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "[I")
    public int[] field3725;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[Lvk;")
    public static class250[] field3724;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(CI)Z")
    public static final boolean method1697(char arg0, int arg1) {
        field3717++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class273.method1663(arg0, (byte) 103)) {
            return true;
        } else {
            char[] var2 = class421.field6112;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class69.field810;
            for (int var5 = arg1; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public abstract void method1698(Canvas arg0, boolean arg1);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public abstract void method1699(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public abstract void method1700(Graphics arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1701(int arg0, byte arg1, int arg2) {
        int var3 = -25 / ((4 - arg1) / 60);
        field3722++;
        return (arg0 & 0x800) != 0 | class106.method643(arg0, arg2, 0) || class371.method2198(arg0, arg2, 45056);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field3724 = null;
        if (arg0 != 10678) {
            method1702(85);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method1703(int arg0, char arg1, String arg2) {
        field3719++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            if (arg1 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }
}
