import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class116 extends class249 {

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Lmb;")
    public static class96 field2162 = class243.method1708(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 115);

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Lhe;")
    public static class136 field2157 = new class136(5000);

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Lw;")
    public class107 field2158;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lw;")
    public class107 field2159;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Lce;")
    public static class111 field2160;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Lff;")
    public static class3 field2163;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lmb;")
    public class96 field2154;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Z")
    public boolean field2153;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Z")
    public static boolean field2168;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field2155;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Lsa;")
    public static final class70 method911(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3282; var4++) {
            class70 var5 = var3.field3274[var4];
            if ((var5.field1197 >> 29 & 0x3L) == 2L && var5.field1208 == arg1 && var5.field1204 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method912(int arg0) {
        field2162 = null;
        field2163 = null;
        field2157 = null;
        if (arg0 != -1) {
            method912(117);
        }
        field2160 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIZIIII)V")
    public static final void method913(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4) {
            return;
        }
        int var9 = arg8 - arg7;
        int var10 = (arg1 - arg5 << 16) / var9;
        field2166++;
        int var11 = arg0 - arg6;
        int var12 = (arg3 - arg2 << 16) / var11;
        class25.method175(arg0, arg6, arg8, var10, (byte) -45, arg2, 0, 0, arg7, var12, arg5);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lmb;B)V")
    public static final void method914(class96 arg0, byte arg1) {
        field2151++;
        int var2 = class244.method1715(arg0, true);
        if (var2 == -1) {
            return;
        }
        class95.field1556 = class227.field3870.field2035[var2] - class179.field3091;
        class27.field455 = class146.field2592 + class176.field3068 - class227.field3870.field2029[var2] - 1;
        int var3 = class95.field1556 - ((int) ((float) class203.field3523.field1856 / class121.field2232));
        int var4 = (int) ((float) class203.field3523.field1856 / class121.field2232) + class95.field1556;
        if (var3 < 0) {
            class95.field1556 = (int) ((float) class203.field3523.field1856 / class121.field2232);
        }
        if (var4 > class140.field2500) {
            class95.field1556 = class140.field2500 - ((int) ((float) class203.field3523.field1856 / class121.field2232));
        }
        int var5 = class27.field455 - ((int) ((float) class203.field3523.field1919 / class121.field2232));
        int var6 = (int) ((float) class203.field3523.field1919 / class121.field2232) + class27.field455;
        if (var5 < 0) {
            class27.field455 = (int) ((float) class203.field3523.field1919 / class121.field2232);
        }
        if (var6 > class176.field3068) {
            class27.field455 = class176.field3068 - (int) ((float) class203.field3523.field1919 / class121.field2232);
        }
        if (arg1 > -126) {
            field2160 = null;
        }
    }
}
