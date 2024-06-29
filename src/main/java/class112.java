import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class112 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[[I")
    public static int[][] field2120 = new int[104][104];

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    public static int[] field2127 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lha;")
    public static class46 field2129 = class271.method1828(":chalreq:", -46);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lpi;")
    public static class181 field2125;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field2122;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "[I")
    public int[] field2126;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[S")
    public static short[] field2117;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method911(byte arg0) {
        field2120 = null;
        field2117 = null;
        field2129 = null;
        field2125 = null;
        if (arg0 > 111) {
            field2127 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method683(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method682(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZII)I")
    public static final int method912(int arg0, boolean arg1, int arg2, int arg3) {
        field2118++;
        class80 var4 = (class80) class126.field2308.method1601(-70, (long) arg0);
        if (var4 == null) {
            return 0;
        }
        int var5 = arg3;
        for (int var6 = 0; var6 < var4.field1522.length; var6++) {
            if (var4.field1522[var6] >= 0 && class99.field1836 > var4.field1522[var6]) {
                class71 var7 = class80.method633(var4.field1522[var6], arg3);
                if (var7.field1228 != null) {
                    class176 var8 = (class176) var7.field1228.method1601(arg3 ^ 0xFFFFFF9C, (long) arg2);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field1526[var6] * var8.field3166;
                        } else {
                            var5 += var8.field3166;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILj;Lj;IIIIJ)V")
    public static final void method913(int arg0, int arg1, int arg2, int arg3, class139 arg4, class139 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class168 var12 = new class168();
        var12.field2949 = arg10;
        var12.field2961 = arg1 * 128 + 64;
        var12.field2967 = arg2 * 128 + 64;
        var12.field2948 = arg3;
        var12.field2951 = arg4;
        var12.field2964 = arg5;
        var12.field2975 = arg6;
        var12.field2966 = arg7;
        var12.field2960 = arg8;
        var12.field2955 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class111.field2080[var13][arg1][arg2] == null) {
                class111.field2080[var13][arg1][arg2] = new class201(var13, arg1, arg2);
            }
        }
        class111.field2080[arg0][arg1][arg2].field3606 = var12;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method914(int arg0) {
        field2124++;
        class262.method1755(this.field2126, this.field2130, this.field2128);
        int var2 = -116 % ((arg0 + 31) / 50);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public abstract void method684(byte arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method915(int arg0) {
        field2121++;
        if (class241.field4281 && arg0 == 128) {
            class1.field11 = null;
            class242.field4292 = null;
            class241.field4281 = false;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg1 != -10543) {
            method916(107, -40, 112, 0, 111, -102, -65, -21, -114, 44, true, -79);
        }
        field2123++;
        if (class277.field4824.method642(arg1 + 10643) == 2) {
            return class148.method1095(arg4, arg5, arg7, (byte) 83, arg2, arg11, arg10, arg6, arg8, arg3, arg0, arg9);
        } else if (class277.field4824.method642(44) > 2) {
            return class185.method1339(arg3, arg6, class277.field4824.method642(arg1 ^ 0xFFFFD6F0), arg8, (byte) -36, arg4, arg7, arg5, arg9, arg0, arg2, arg10, arg11);
        } else {
            return class10.method56(arg3, arg2, arg10, arg8, 0, arg6, arg5, arg9, arg11, arg0, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    protected class112() {
    }
}
