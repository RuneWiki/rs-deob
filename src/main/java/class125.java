import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class125 {

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1880;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "[Ldn;")
    public static class323[] field1879;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static void method951(boolean arg0) {
        if (arg0) {
            method955(86, 68, -122);
        }
        field1879 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
    public static final boolean method952(int arg0) {
        field1878++;
        if (arg0 >= -95) {
            method953((String) null, false);
        }
        try {
            return class422.method2604(true);
        } catch (IOException var4) {
            class409.method2539((byte) 6);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class451.field6496 + "," + class21.field272 + "," + class304.field4149 + " - " + class213.field2982 + "," + (class359.field4970.field2662[0] + class6.field65) + "," + (class371.field5148 + class359.field4970.field2659[0]) + " - ";
            for (int var3 = 0; class213.field2982 > var3 && var3 < 50; var3++) {
                var2 = var2 + class75.field1068.field5076[var3] + ",";
            }
            class48.method399((byte) 86, var5, var2);
            class67.method539(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method953(String arg0, boolean arg1) {
        field1881++;
        if (class178.field2543 == null) {
            class65.method521((byte) 71);
        }
        String[] var2 = class6.method27((byte) 120, arg0, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class395.field5486; var4 > 0; var4--) {
                class178.field2543[var4] = class178.field2543[var4 - 1];
            }
            class178.field2543[0] = var2[var3];
            if (class395.field5486 < class178.field2543.length - 1) {
                class395.field5486++;
                if (class210.field2937 > 0) {
                    class210.field2937++;
                }
            }
        }
        if (!arg1) {
            method955(21, 91, -64);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([BILrg;)V")
    public final void method954(byte[] arg0, int arg1, class366 arg2) {
        field1877++;
        if (arg2.field5076[arg2.field5048] != 31 || arg2.field5076[arg2.field5048 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1880 == null) {
            this.field1880 = new Inflater(true);
        }
        try {
            this.field1880.setInput(arg2.field5076, arg2.field5048 + 10, -arg2.field5048 - (8 - arg2.field5076.length) + -10);
            this.field1880.inflate(arg0);
        } catch (Exception var4) {
            this.field1880.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 != -31867) {
            field1879 = null;
        }
        this.field1880.reset();
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
    public static final int method955(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return -16;
        }
        field1882++;
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class125() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
    public static final int method956(int arg0) {
        field1883++;
        if (class397.field5497) {
            return 0;
        } else if (!class397.method2461(arg0 - 83)) {
            return 1;
        } else if (arg0 == 1) {
            return class230.field3237 ? 2 : 1;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(III)V")
    private class125(int arg0, int arg1, int arg2) {
    }
}
