import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class143 extends class113 {

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public int field3495 = 1000;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Le;")
    public static class29 field3493 = new class29(30);

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "[J")
    public static long[] field3496 = new long[32];

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lu;")
    public static class135 field3502 = class87.method676((byte) -74, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lu;")
    public static class135 field3501 = class87.method676((byte) -118, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "Lre;")
    public static class122 field3498;

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "Lcc;")
    public static class18 field3500;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V")
    public void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class91 var10 = this.method273((byte) -115);
        if (var10 != null) {
            this.field3495 = var10.field3495;
            var10.method691(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        field3499++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BILsd;I[Lob;I)V")
    public static final void method1174(byte[] arg0, int arg1, class127 arg2, int arg3, class99[] arg4, int arg5) {
        field3491++;
        class59 var6 = new class59(arg0);
        int var7 = arg3;
        while (true) {
            int var8 = var6.method450((byte) -71);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method450((byte) -71);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method480(~arg3);
                int var15 = var14 & 0x3;
                int var16 = arg1 + var11;
                int var17 = var14 >> 2;
                int var18 = arg5 + var12;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    int var19 = var13;
                    class99 var20 = null;
                    if ((client.field525[1][var16][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg4[var19];
                    }
                    class104.method849(arg2, var15, (byte) -91, var18, var13, var16, var20, var17, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
    public static final void method1175(int arg0, int arg1) {
        field3490++;
        int var2 = -93 % ((arg1 + 73) / 40);
        for (class8 var3 = (class8) class115.field2751.method840(-1); var3 != null; var3 = (class8) class115.field2751.method837((byte) -57)) {
            if ((var3.field951 >> 48 & 0xFFFFL) == (long) arg0) {
                var3.method302(4071);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lna;")
    public class91 method273(byte arg0) {
        int var2 = 114 / ((arg0 + 59) / 51);
        field3497++;
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field3500 = null;
        if (arg0 != 65535) {
            return;
        }
        field3498 = null;
        field3502 = null;
        field3501 = null;
        field3496 = null;
        field3493 = null;
    }
}
