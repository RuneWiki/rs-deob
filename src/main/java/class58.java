import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class58 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lck;")
    public static class119 field937 = class298.method1987((byte) 4, "Ablegen");

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lck;")
    public static class119 field935 = class298.method1987((byte) 74, "mapdots");

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Luc;")
    public static class253 field942;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field938;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[[Z")
    public static boolean[][] field936;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 4)
    public static final void method430(byte arg0) {
        field941++;
        class153 var1 = class299.field5049;
        synchronized (class299.field5049) {
            class272.field4475 = class246.field3980;
            class266.field4354++;
            class129.field1984 = class181.field2877;
            int var2 = 41 % ((arg0 + 52) / 53);
            class65.field1024 = class272.field4476;
            class296.field4938 = class253.field4084;
            class245.field3975 = class262.field4221;
            class210.field3346 = class174.field2794;
            class226.field3607 = class114.field1728;
            class253.field4084 = 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[S)[S", line = 39)
    public static final short[] method431(int arg0, short[] arg1) {
        field940++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        if (arg0 < 95) {
            method431(58, (short[]) null);
        }
        class213.method1343(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 76)
    public class58() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lvc;III)V", line = 92)
    public static final void method432(class293 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class208.field3328) {
            class104 var4 = class150.field2390[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1598 != null && var4.field1598.field3178.method1465()) {
                arg0.method1481(var4.field1598.field3178, 128, 0, 0, true);
            }
        }
        if (arg3 < class208.field3328) {
            class104 var5 = class150.field2390[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1598 != null && var5.field1598.field3178.method1465()) {
                arg0.method1481(var5.field1598.field3178, 0, 0, 128, true);
            }
        }
        if (arg2 < class208.field3328 && arg3 < class103.field1569) {
            class104 var6 = class150.field2390[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1598 != null && var6.field1598.field3178.method1465()) {
                arg0.method1481(var6.field1598.field3178, 128, 0, 128, true);
            }
        }
        if (arg2 < class208.field3328 && arg3 > 0) {
            class104 var7 = class150.field2390[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1598 != null && var7.field1598.field3178.method1465()) {
                arg0.method1481(var7.field1598.field3178, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLfj;[B)V", line = 140)
    public final void method433(boolean arg0, class3 arg1, byte[] arg2) {
        if (!arg0) {
            method431(5, (short[]) null);
        }
        field939++;
        if (arg1.field101[arg1.field44] != 31 || arg1.field101[arg1.field44 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field938 == null) {
            this.field938 = new Inflater(true);
        }
        try {
            this.field938.setInput(arg1.field101, arg1.field44 + 10, arg1.field101.length + -8 + -arg1.field44 + -10);
            this.field938.inflate(arg2);
        } catch (Exception var5) {
            this.field938.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field938.reset();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 167)
    public static void method434(int arg0) {
        if (arg0 != 0) {
            method432((class293) null, 126, 9, 0);
        }
        field935 = null;
        field942 = null;
        field937 = null;
        field936 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(III)V", line = 181)
    private class58(int arg0, int arg1, int arg2) {
    }
}
