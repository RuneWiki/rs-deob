import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class124 {

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1724;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Ljava/io/File;")
    private File field1707;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "J")
    private long field1709;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "J")
    private long field1714;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field1722 = 0;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Z")
    public static boolean field1719 = false;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "F")
    public static float field1727;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Loaa;")
    public static class260 field1708;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field1728;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "[I")
    public static int[] field1721;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method878(int arg0) {
        field1713++;
        if (arg0 != 0) {
            field1727 = -0.60763335F;
        }
        return this.field1707;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public static void method879(int arg0) {
        field1721 = null;
        field1708 = null;
        if (arg0 < 22) {
            method881(null, null, 119);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([BIII)V")
    public final void method880(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1712++;
        if (arg1 != 1) {
            method879(98);
        }
        if (((long) arg3 + this.field1709) > this.field1714) {
            this.field1724.seek(this.field1714);
            this.field1724.write(1);
            throw new EOFException();
        } else {
            this.field1724.write(arg0, arg2, arg3);
            this.field1709 += arg3;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
    public static final boolean method881(Class arg0, String arg1, int arg2) {
        if (arg2 <= 109) {
            field1721 = null;
        }
        field1710++;
        Class var3 = (Class) class674.field9492.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        Object var4 = null;
        File var5 = (File) class210.field3095.get(arg1);
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg0, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class674.field9492.put(arg1, arg0);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class674.field9492.put(arg1, field1728 == null ? (field1728 = method887("lo")) : field1728);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)J")
    public final long method882(int arg0) throws IOException {
        field1723++;
        if (arg0 > -24) {
            method881(null, null, -12);
        }
        return this.field1724.length();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(JB)V")
    public final void method883(long arg0, byte arg1) throws IOException {
        this.field1724.seek(arg0);
        field1717++;
        this.field1709 = arg0;
        int var4 = 41 % ((arg1 - 43) / 58);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BII[B)I")
    public final int method884(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -40) {
            this.field1707 = null;
        }
        field1715++;
        int var5 = this.field1724.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field1709 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBI)I")
    public static final int method885(int arg0, byte arg1, int arg2) {
        field1718++;
        if (arg1 != -84) {
            return -104;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1724 != null) {
            System.out.println("Warning! fileondisk " + this.field1707 + " not closed correctly using close(). Auto-closing instead. ");
            this.method886(true);
        }
        field1725++;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field1724 = new RandomAccessFile(arg0, arg1);
        this.field1707 = arg0;
        this.field1709 = 0L;
        this.field1714 = arg2;
        int var5 = this.field1724.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1724.seek(0L);
            this.field1724.write(var5);
        }
        this.field1724.seek(0L);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public final void method886(boolean arg0) throws IOException {
        if (this.field1724 != null) {
            this.field1724.close();
            this.field1724 = null;
        }
        if (arg0) {
            field1716++;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method887(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
