import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class class520 {

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public int field7237 = 0;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public volatile int field7238 = 0;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "[B")
    public byte[] field7241 = new byte[5000];

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field7239 = new Object[5000];

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public volatile int field7246 = 0;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public int field7249 = 0;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "Lbn;")
    public static class371 field7248;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "F")
    public static float field7242;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIILsa;)V")
    public abstract void method763(boolean arg0, int arg1, int arg2, class544 arg3);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
    public static final int method2896(int arg0, int arg1) {
        field7245++;
        if (arg0 != 13945) {
            method2897(-32);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public static void method2897(int arg0) {
        field7248 = null;
        if (arg0 != 5000) {
            method2897(-48);
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V")
    public abstract void method760(int arg0, int arg1);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lrg;B)V")
    public abstract void method767(class563 arg0, byte arg1);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
    public abstract void method768(boolean arg0);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLrg;)V")
    public abstract void method756(byte arg0, class563 arg1);

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)V")
    public static final void method2898(int arg0, int arg1) {
        if (arg1 != -26760) {
            method2898(-65, 65);
        }
        field7244++;
        if (class317.field4377 == null || class317.field4377.length < arg0) {
            class317.field4377 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)V")
    public abstract void method757(int arg0, byte arg1);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public abstract void method755(byte arg0);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B[BLjava/io/File;I)V")
    public static final void method2899(byte arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        field7243++;
        if (arg0 < 30) {
            method2898(-78, -101);
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILrg;)V")
    public abstract void method758(int arg0, class563 arg1);

    static {
        new class344("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field7240 = 0;
        field7248 = new class371(14, 0, 4, 1);
    }
}
