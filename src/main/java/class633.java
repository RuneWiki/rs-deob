import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class633 extends class735 {

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    private int field8762 = -1;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "Lfja;")
    public static class783 field8763 = new class783(58, 0);

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Z")
    public static boolean field8766 = true;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Lvl;")
    public static class15 field8765 = new class15(43, 2);

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Ljda;")
    public static class240 field8767 = new class240();

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "Z")
    public static boolean field8768 = false;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lrh;Z)V", line = 3)
    public final void method624(class280 arg0, boolean arg1) {
        if (!arg1) {
            field8760++;
            arg0.method1801(this.field8762, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I", line = 18)
    public static final int method3543(int arg0) {
        field8761++;
        if (class576.field8171 == 0) {
            class651.field8997.method3653(arg0 + 18472, new class656("jaclib"));
            if (class651.field8997.method3648(true).method1501((byte) 5) != 100) {
                return 1;
            }
            if (!((class656) class651.field8997.method3648(true)).method3691((byte) 127)) {
                class594.field8348.method3804((byte) 93);
            }
            class576.field8171 = 1;
        }
        if (class576.field8171 == 1) {
            class706.field9705 = class651.method3652(-82);
            class651.field8989.method3653(-1, new class215(class215.field3192));
            class651.field8998.method3653(-1, new class656("jaggl"));
            class651.field8999.method3653(-1, new class656("jagdx"));
            class651.field9000.method3653(arg0 ^ 0x4828, new class656("jagmisc"));
            class651.field9001.method3653(-1, new class656("sw3d"));
            class651.field9002.method3653(-1, new class656("hw3d"));
            class651.field9003.method3653(-1, new class656("jagtheora"));
            class651.field9004.method3653(-1, new class215(class365.field4958));
            class651.field9005.method3653(-1, new class215(class341.field4603));
            class651.field9006.method3653(arg0 + 18472, new class215(class527.field7156));
            class651.field9007.method3653(-1, new class215(class649.field8977));
            class651.field9008.method3653(-1, new class215(class249.field3517));
            class651.field9009.method3653(-1, new class215(class735.field10152));
            class651.field9010.method3653(-1, new class215(class153.field2523));
            class651.field9011.method3653(-1, new class215(class783.field10760));
            class651.field9012.method3653(-1, new class215(class713.field9816));
            class651.field9013.method3653(arg0 ^ 0x4828, new class215(class602.field8423));
            class651.field9014.method3653(arg0 + 18472, new class215(class683.field9512));
            class651.field9015.method3653(-1, new class215(class619.field8622));
            class651.field9016.method3653(-1, new class215(class369.field4998));
            class651.field9017.method3653(-1, new class215(class496.field6788));
            class651.field9018.method3653(-1, new class507(class530.field7185, "huffman"));
            class651.field9019.method3653(arg0 + 18472, new class215(class341.field4600));
            class651.field9020.method3653(-1, new class215(class687.field9554));
            class651.field9021.method3653(-1, new class215(class564.field7989));
            class651.field9022.method3653(-1, new class343(class744.field10270, "details"));
            for (int var1 = 0; var1 < class706.field9705.length; var1++) {
                if (class706.field9705[var1].method3648(true) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class651[] var3 = class706.field9705;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class651 var5 = var3[var4];
                int var6 = var5.method3650(-15959);
                int var7 = var5.method3648(true).method1501((byte) 5);
                var2 += var6 * var7 / 100;
            }
            class431.field5877 = var2;
            class576.field8171 = 2;
        }
        if (class706.field9705 == null) {
            return 100;
        }
        int var8 = 0;
        if (arg0 != -18473) {
            field8763 = null;
        }
        int var9 = 0;
        boolean var10 = true;
        class651[] var11 = class706.field9705;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class651 var16 = var11[var12];
            int var17 = var16.method3650(-15959);
            int var18 = var16.method3648(true).method1501((byte) 5);
            var9 += var17 * var18 / 100;
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
        }
        if (var10) {
            if (!((class656) class651.field9000.method3648(true)).method3691((byte) 125)) {
                class594.field8348.method3806(1);
            }
            if (!((class656) class651.field9003.method3648(true)).method3691((byte) 126)) {
                class137.field2351 = class594.field8348.method3803(-58);
            }
            class706.field9705 = null;
        }
        int var13 = var8 - class431.field5877;
        int var14 = var9 - class431.field5877;
        int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V", line = 167)
    public static void method3544(byte arg0) {
        field8765 = null;
        int var1 = 100 % ((arg0 - 78) / 33);
        field8763 = null;
        field8767 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILfca;)V", line = 187)
    public final void method627(int arg0, class93 arg1) {
        field8764++;
        this.field8762 = arg1.method763(103);
        if (arg0 != 5) {
            method3543(-58);
        }
    }
}
