import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class63 {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1237 = 0;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[S")
    public static short[] field1238 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[[I")
    public static int[][] field1242 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lsj;")
    public static class49 field1236;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field1241;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method465(byte arg0) {
        field1242 = null;
        field1241 = null;
        if (arg0 >= 28) {
            field1236 = null;
            field1238 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method466(int arg0) {
        class116.field2335 = 0;
        int var1 = (class223.field4069.field1571 >> 7) + class174.field3178;
        field1240++;
        int var2 = (class223.field4069.field1534 >> 7) + class245.field4444;
        int var3 = 41 % ((arg0 - 43) / 35);
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class116.field2335 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class116.field2335 = 1;
        }
        if (class116.field2335 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class116.field2335 = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)I")
    public abstract int method467(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static final void method468(int arg0) {
        class185.field3332 = null;
        class202.field3638 = null;
        field1239++;
        class271.field4815 = null;
        class182.field3289 = null;
        class110.field2226 = null;
        if (arg0 < 112) {
            method469(77, false);
        }
        class117.field2341 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IZ)V")
    public static final void method469(int arg0, boolean arg1) {
        class195 var2 = class178.method1229(arg0, 5, 111);
        field1234++;
        if (arg1) {
            method470((class42) null, 83);
        }
        var2.method1340(true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lji;I)Lji;")
    public static final class42 method470(class42 arg0, int arg1) {
        field1235++;
        class42 var2 = client.method1076(arg0);
        if (arg1 != -19257) {
            field1238 = null;
        }
        if (var2 == null) {
            var2 = arg0.field774;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method471(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method472(int arg0, int arg1) {
        field1243++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 == 17680) {
            return class177.method1219(arg1, -1636);
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lbe;")
    public abstract class28 method473(byte arg0);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
    public abstract void method474(int arg0, int arg1);
}
