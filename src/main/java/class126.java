import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class126 extends class260 {

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Lef;")
    public class338 field1881;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Lwj;")
    public static class270 field1875 = new class270(92, -1);

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
    public boolean field1877;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[Ltt;")
    public static class61[] field1884;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
    public abstract boolean method867(byte arg0);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method868(String arg0, int arg1, String arg2, int arg3) {
        field1879++;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = (char) arg3;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class225.method1398(var22, 69);
            var9 = class225.method1398(var24, 69);
            char var26 = class307.method1780(arg1, var22, (byte) -31);
            char var27 = class307.method1780(arg1, var24, (byte) -31);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class361.method2177(arg1, var28, arg3) - class361.method2177(arg1, var29, 0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class361.method2177(arg1, var20, 0) - class361.method2177(arg1, var21, arg3);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class361.method2177(arg1, var14, 0) - class361.method2177(arg1, var15, 0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)I")
    public final int method869(byte arg0) {
        field1882++;
        if (arg0 > -111) {
            this.method877(-73);
        }
        return 1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
    public static final void method870() {
        class472.method2780(1, class253.field3523);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static void method871(boolean arg0) {
        field1884 = null;
        if (!arg0) {
            field1875 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public abstract void method872(int arg0);

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Z")
    public abstract boolean method873(int arg0);

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)I")
    public int method874(byte arg0) {
        field1878++;
        return arg0 == 80 ? 0 : -43;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
    public abstract void method875(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
    public abstract void method876(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)Z")
    public final boolean method877(int arg0) {
        field1876++;
        if (arg0 >= -35) {
            field1883 = -87;
        }
        return this.field1877;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lef;)V")
    public class126(class338 arg0) {
        this.field1881 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)Z")
    public final boolean method878(int arg0) {
        if (arg0 != 0) {
            field1883 = 50;
        }
        field1880++;
        return false;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILml;ILml;)V")
    public abstract void method879(int arg0, class264 arg1, int arg2, class264 arg3);
}
