import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class457 extends class82 {

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "Z")
    private boolean field6286 = true;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "Z")
    private boolean field6290 = true;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field6288 = 0;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "[I")
    public static int[] field6294;

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "Loca;")
    public static class220 field6292;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "[[I")
    public static int[][] field6296;

    static {
        new class180("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field6294 = new int[5];
        field6295 = 0;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)[I", line = 6)
    public final int[] method201(int arg0, int arg1) {
        if (arg1 != 12218) {
            return null;
        } else {
            ++field6293;
            int[] var3 = super.field990.method1566((byte) 116, arg0);
            if (super.field990.field3641) {
                int[] var4 = this.method489(false, 0, this.field6290 ? -arg0 + class466.field6523 : arg0);
                if (!this.field6286) {
                    class345.method1931(var4, 0, var3, 0, class629.field9033);
                } else {
                    for (int var5 = 0; ~class629.field9033 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class129.field1590];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[[I", line = 45)
    public final int[][] method481(int arg0, int arg1) {
        if (arg0 != 1000) {
            field6296 = null;
        }
        ++field6291;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, this.field6290 ? class466.field6523 - arg1 : arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6286) {
                for (int var11 = 0; class629.field9033 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class629.field9033; ++var12) {
                    var8[var12] = var5[class129.field1590 - var12];
                    var9[var12] = var6[-var12 + class129.field1590];
                    var10[var12] = var7[-var12 + class129.field1590];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V", line = 113)
    public class457() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILos;)V", line = 116)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field6287;
        int var4 = -12 % ((arg1 - -69) / 42);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field999 = arg2.method2129(-98) == 1;
                }
            } else {
                this.field6290 = arg2.method2129(-112) == 1;
            }
        } else {
            this.field6286 = arg2.method2129(-111) == 1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "(I)V", line = 169)
    public static void method2665(int arg0) {
        field6296 = null;
        field6292 = null;
        if (arg0 != 2) {
            field6288 = 92;
        }
        field6294 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[BLjava/io/File;I)V", line = 186)
    public static final void method2666(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        ++field6289;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, arg3, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
