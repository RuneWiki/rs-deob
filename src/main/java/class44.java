import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class44 extends class170 {

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lbf;")
    public class81 field686;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Lsc;")
    public static class181 field685 = class149.method967(255, "null");

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
    public static final void method298(byte arg0) {
        class137.field2236 = 0;
        class131.field2176 = 0;
        field688++;
        class61.method438(arg0 ^ 0xFFFF859A);
        class58.method420(true);
        class65.method465(9949);
        int var1 = 0;
        if (arg0 != 111) {
            field684 = 90;
        }
        while (var1 < class131.field2176) {
            int var3 = class148.field2480[var1];
            if (class237.field4125 != class129.field2140[var3].field2639) {
                if (class129.field2140[var3].field3117.method456(false)) {
                    class181.method1231(class129.field2140[var3], arg0 - 10);
                }
                class129.field2140[var3].field3117 = null;
                class129.field2140[var3] = null;
            }
            var1++;
        }
        if (class108.field1772 != class76.field1223.field3933) {
            throw new RuntimeException("gnp1 pos:" + class76.field1223.field3933 + " psize:" + class108.field1772);
        }
        for (int var2 = 0; var2 < class137.field2237; var2++) {
            if (class129.field2140[class263.field4581[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class137.field2237);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Lp;")
    public static final class93 method299(int arg0, int arg1) {
        field683++;
        class93 var2 = (class93) class136.field2217.method990((byte) 80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class159.field2728.method89(arg0, 11, 99);
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method614((byte) 117, new class230(var3));
        }
        int var5 = -105 % ((34 - arg1) / 35);
        class136.field2217.method982(var4, (byte) 60, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
    public static final void method300(int arg0, int arg1) {
        class144.field2333.method1689(new class124(arg0), 96);
        field687++;
        if (arg1 != 0) {
            field685 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public static void method301(int arg0) {
        if (arg0 != 0) {
            field684 = 95;
        }
        field685 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lbf;)V")
    public class44(class81 arg0) {
        this.field686 = arg0;
    }
}
