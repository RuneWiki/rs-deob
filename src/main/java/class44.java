import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class44 {

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "Z")
    public boolean field629;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "B")
    public byte field627;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "S")
    public short field628;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "S")
    public short field630;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "S")
    public short field638;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "Ldb;")
    public static class298 field632 = new class298(74, 11);

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "Lha;")
    public static class56 field637;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIII)I", line = 5)
    public static final int method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -19104) {
            return 64;
        }
        field633++;
        int var5 = arg4 & 0xF;
        int var6 = var5 >= 8 ? arg0 : arg2;
        int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg2 : arg1);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/io/File;I[B)V", line = 35)
    public static final void method313(int arg0, File arg1, int arg2, byte[] arg3) throws IOException {
        field639++;
        if (arg2 != 2) {
            method314(12);
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg3, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V", line = 53)
    public static void method314(int arg0) {
        field632 = null;
        if (arg0 != 14) {
            field637 = null;
        }
        field637 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 66)
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field629 = arg10;
        this.field635 = arg0;
        this.field627 = (byte) arg8;
        this.field631 = arg2;
        this.field628 = (short) arg6;
        this.field636 = arg3;
        this.field630 = (short) arg5;
        this.field638 = (short) arg4;
        this.field640 = arg1;
        this.field634 = arg11;
    }
}
