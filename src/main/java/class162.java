import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class162 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lc;")
    public static class103 field2998 = new class103(512);

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lhj;")
    public static class69 field3001 = class181.method1318("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -127);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Z")
    public static boolean field3002 = true;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lhj;")
    public static class69 field3004 = class181.method1318("Lade Texturen )2 ", (byte) -121);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "[[I")
    public static int[][] field3005 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lse;")
    public static class198 field2999;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lnc;")
    public static class83 field3000;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    public abstract int method163(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public abstract void method158(boolean arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1209(int arg0) {
        field2999 = null;
        field2998 = null;
        field3000 = null;
        field3001 = null;
        if (arg0 == 23988) {
            field3005 = null;
            field3004 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lnc;III)[Lqb;")
    public static final class56[] method1210(class83 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 13) {
            method1211((class128) null, (byte) 109);
        }
        field2997++;
        return class244.method1735(arg0, arg3 - 13, arg1, arg2) ? class172.method1261(arg3 ^ 0xF2) : null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfh;B)V")
    public static final void method1211(class128 arg0, byte arg1) {
        byte[] var2 = new byte[24];
        field3003++;
        if (class28.field399 != null) {
            try {
                class28.field399.method1090(true, 0L);
                int var3 = 0;
                class28.field399.method1091(var2, true);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method921((byte) -17, 24, var2, 0);
        if (arg1 > -90) {
            method1209(69);
        }
    }
}
