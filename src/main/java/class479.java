import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class479 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[[I")
    public static int[][] field7010 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Ldq;")
    public static class493 field7011 = new class493(35, -1);

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    public static int[] field7012 = new int[2048];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lfr;")
    public static class284 field7013;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7008;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    public static int[] field7009;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[I")
    public static int[] field7014;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 8)
    public static void method2925(byte arg0) {
        field7012 = null;
        field7013 = null;
        field7010 = null;
        field7009 = null;
        field7011 = null;
        if (arg0 >= -68) {
            method2925((byte) -21);
        }
        field7014 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lfh;[BI)V", line = 28)
    public final void method2926(class463 arg0, byte[] arg1, int arg2) {
        field7007++;
        if (arg0.field6618[arg0.field6631] != 31 || arg0.field6618[arg0.field6631 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field7008 == null) {
            this.field7008 = new Inflater(true);
        }
        try {
            if (arg2 != 116) {
                this.field7008 = null;
            }
            this.field7008.setInput(arg0.field6618, arg0.field6631 + 10, arg0.field6618.length - 8 - arg0.field6631 - 10);
            this.field7008.inflate(arg1);
        } catch (Exception var4) {
            this.field7008.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7008.reset();
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 59)
    public class479() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V", line = 66)
    private class479(int arg0, int arg1, int arg2) {
    }
}
