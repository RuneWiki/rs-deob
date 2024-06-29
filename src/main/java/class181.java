import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class181 extends class235 {

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "[B")
    public byte[] field3127;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Lsb;")
    public static class98 field3119 = class47.method368("mapfunction", 0);

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "Lsb;")
    public static class98 field3123 = class47.method368(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field3116 = 10;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[I")
    public static int[] field3120 = new int[50];

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "Lsb;")
    public static class98 field3126 = class47.method368("(U2", 0);

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3129 = new CRC32();

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "[Lsb;")
    public static class98[] field3131 = new class98[100];

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Lq;")
    public static class148 field3128;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "Ltg;")
    public static class75 field3124;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Z")
    public static final boolean method1246(boolean arg0) {
        if (!arg0) {
            method1247(55, 100, -24);
        }
        field3130++;
        return class216.field3685 == 0 ? class131.field2330.method61(-7804) : true;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)J")
    public static final long method1247(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        return var3 == null || var3.field1157 == null ? 0L : var3.field1157.field3535;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lsb;I)Laf;")
    public static final class150 method1248(class98 arg0, int arg1) {
        field3117++;
        for (class150 var2 = (class150) class93.field1623.method371((byte) 61); var2 != null; var2 = (class150) class93.field1623.method370(true)) {
            if (var2.field2763.method748(true, arg0)) {
                return var2;
            }
        }
        if (arg1 != 1) {
            field3129 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
    public static final boolean method1249(byte arg0) {
        if (arg0 == 62) {
            field3125++;
            return class93.field1640;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BZLjj;)V")
    public static final void method1250(byte arg0, boolean arg1, class34 arg2) {
        field3115++;
        int var3 = (int) arg2.field4061;
        int var4 = arg2.field596;
        arg2.method1611((byte) 9);
        if (arg1) {
            class99.method757(var4, (byte) -81);
        }
        class53.method397((byte) 22, var4);
        class148 var5 = class62.method455(-854073200, var3);
        if (var5 != null) {
            class72.method512(var5, arg0 ^ 0x43);
        }
        class97.field1672 = false;
        class226.field3894 = 0;
        if (arg0 != 65) {
            method1251(-96);
        }
        class92.method681(-118, class88.field1553, class81.field1434, class41.field670, class14.field258);
        if (class232.field3992 != -1) {
            class235.method1610(class232.field3992, arg0 ^ 0x5E15, 1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method1251(int arg0) {
        if (arg0 != -21337) {
            field3129 = null;
        }
        field3118++;
        class162.field2934.method1565(-1);
        class60.field986.method1565(arg0 ^ 0x5358);
        class48.field801.method1565(arg0 ^ 0x5358);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
    public static void method1252(byte arg0) {
        field3124 = null;
        field3131 = null;
        field3128 = null;
        field3129 = null;
        if (arg0 != -56) {
            field3126 = null;
        }
        field3126 = null;
        field3119 = null;
        field3123 = null;
        field3120 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B)V")
    public class181(byte[] arg0) {
        this.field3127 = arg0;
    }
}
