import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 extends class72 {

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public int field644 = 0;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "Lec;")
    public static class28 field642 = class28.method210(-46, "Enter name:");

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "Z")
    public static boolean field646 = false;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lec;")
    public static class28 field649 = class28.method210(-46, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field647 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "Lec;")
    public static class28 field651 = class28.method210(-46, "You need to set*6nnew contact details)3");

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "[I")
    public static int[] field650 = new int[25];

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "Lec;")
    public static class28 field653 = class28.method210(-46, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "J")
    public static long field641;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lnd;")
    public static class82 field652;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILud;)V")
    private final void method243(int arg0, int arg1, class119 arg2) {
        if (arg1 < 53) {
            this.field644 = 40;
        }
        if (arg0 == 5) {
            this.field644 = arg2.method903(2);
        }
        field643++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BB)[B")
    public static final byte[] method244(byte[] arg0, byte arg1) {
        field640++;
        class119 var2 = new class119(arg0);
        int var3 = var2.method879((byte) 45);
        if (arg1 >= -14) {
            method245(78);
        }
        int var4 = var2.method882(-52);
        if (var4 < 0 || class18.field365 != 0 && var4 > class18.field365) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method891(0, var4, var5, -1);
            return var5;
        } else {
            int var6 = var2.method882(-83);
            if (var6 < 0 || class18.field365 != 0 && var6 > class18.field365) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class108.method739(var7, var6, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method245(int arg0) {
        field653 = null;
        field652 = null;
        int var1 = 15 % ((45 - arg0) / 54);
        field647 = null;
        field651 = null;
        field649 = null;
        field650 = null;
        field642 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lud;B)V")
    public final void method246(class119 arg0, byte arg1) {
        field645++;
        if (arg1 > -46) {
            return;
        }
        while (true) {
            int var3 = arg0.method879((byte) 45);
            if (var3 == 0) {
                return;
            }
            this.method243(var3, 97, arg0);
        }
    }
}
