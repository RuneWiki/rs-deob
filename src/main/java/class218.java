import java.awt.Container;
import java.awt.Insets;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class218 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2857;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "J")
    private long field2869;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Ljava/io/File;")
    private File field2856;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "J")
    private long field2866;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "[I")
    public static int[] field2861 = new int[14];

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Loi;")
    public static class57 field2855;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Ljava/io/File;", line = 5)
    public final File method1388(int arg0) {
        field2865++;
        return arg0 == 10175 ? this.field2856 : null;
    }

    @OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        if (this.field2857 != null) {
            System.out.println("Warning! fileondisk " + this.field2856 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1397(true);
        }
        field2862++;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lpe;B)V", line = 34)
    public static final void method1389(class615 arg0, byte arg1) {
        class13.field139 = arg0.method3359("hitmarks", (byte) -126);
        field2853++;
        class37.field543 = arg0.method3359("hitbar_default", (byte) -112);
        class188.field2406 = arg0.method3359("timerbar_default", (byte) -125);
        class618.field8350 = arg0.method3359("headicons_pk", (byte) -111);
        class524.field6829 = arg0.method3359("headicons_prayer", (byte) -120);
        if (arg1 != 91) {
            field2861 = null;
        }
        class258.field3480 = arg0.method3359("hint_headicons", (byte) -124);
        class400.field5110 = arg0.method3359("hint_mapmarkers", (byte) -112);
        class194.field2538 = arg0.method3359("mapflag", (byte) -116);
        class86.field1151 = arg0.method3359("cross", (byte) -128);
        class463.field6059 = arg0.method3359("mapdots", (byte) -112);
        class374.field4794 = arg0.method3359("scrollbar", (byte) -109);
        class429.field5555 = arg0.method3359("name_icons", (byte) -123);
        class25.field312 = arg0.method3359("floorshadows", (byte) -117);
        class16.field180 = arg0.method3359("compass", (byte) -122);
        class640.field8894 = arg0.method3359("otherlevel", (byte) -111);
        class175.field2191 = arg0.method3359("hint_mapedge", (byte) -115);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[BI)I", line = 61)
    public final int method1390(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2860++;
        if (arg0 != 0) {
            field2861 = null;
        }
        int var5 = this.field2857.read(arg2, arg3, arg1);
        if (var5 > 0) {
            this.field2866 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)J", line = 81)
    public final long method1391(int arg0) throws IOException {
        if (arg0 != 14) {
            this.field2869 = -121L;
        }
        field2864++;
        return this.field2857.length();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IJ)V", line = 95)
    public final void method1392(int arg0, long arg1) throws IOException {
        this.field2857.seek(arg1);
        field2854++;
        if (arg0 != 13984) {
            this.field2856 = null;
        }
        this.field2866 = arg1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[BBI)V", line = 107)
    public final void method1393(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field2868++;
        if (this.field2869 < ((long) arg0 + this.field2866)) {
            this.field2857.seek(this.field2869);
            this.field2857.write(1);
            throw new EOFException();
        } else {
            int var5 = -44 / ((60 - arg2) / 40);
            this.field2857.write(arg1, arg3, arg0);
            this.field2866 += arg0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V", line = 126)
    public static final void method1394(int arg0) {
        field2858++;
        if (class114.field1483 != null) {
            return;
        }
        if (arg0 != 8323) {
            field2870 = -62;
        }
        Container var1;
        if (class425.field5520 != null) {
            var1 = class425.field5520;
        } else if (class348.field4462 == null) {
            var1 = class50.field706;
        } else {
            var1 = class348.field4462;
        }
        class544.field7066 = var1.getSize().width;
        class207.field2669 = var1.getSize().height;
        if (class425.field5520 == var1) {
            Insets var2 = class425.field5520.getInsets();
            class207.field2669 -= var2.top + var2.bottom;
            class544.field7066 -= var2.right + var2.left;
        }
        if (class62.method528(arg0 - 8321) == 1) {
            class461.field6047 = class535.field6968;
            class349.field4470 = 0;
            class289.field3729 = (class544.field7066 - class94.field1240) / 2;
            class519.field6796 = class94.field1240;
        } else {
            class556.method2982(0);
        }
        if (class555.field7261 != class119.field1536) {
            boolean var10000;
            if (class519.field6796 < 1024 && class461.field6047 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class524.field6827.setSize(class519.field6796, class461.field6047);
        if (class520.field6799 != null) {
            class520.field6799.method367(class524.field6827);
        }
        if (class425.field5520 == var1) {
            Insets var3 = class425.field5520.getInsets();
            class524.field6827.setLocation(var3.left + class289.field3729, class349.field4470 + var3.top);
        } else {
            class524.field6827.setLocation(class289.field3729, class349.field4470);
        }
        if (class196.field2562 != -1) {
            class380.method2169(true, true);
        }
        class337.method1933((byte) 59);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V", line = 205)
    public static final void method1395(int arg0, int arg1) {
        field2863++;
        class367 var2 = class573.method3057(arg0, arg1, 2);
        var2.method2113(85);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 215)
    public static void method1396(byte arg0) {
        field2855 = null;
        if (arg0 == -53) {
            field2861 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V", line = 228)
    public final void method1397(boolean arg0) throws IOException {
        if (!arg0) {
            return;
        }
        if (this.field2857 != null) {
            this.field2857.close();
            this.field2857 = null;
        }
        field2867++;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 247)
    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field2857 = new RandomAccessFile(arg0, arg1);
        this.field2869 = arg2;
        this.field2856 = arg0;
        this.field2866 = 0L;
        int var5 = this.field2857.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2857.seek(0L);
            this.field2857.write(var5);
        }
        this.field2857.seek(0L);
    }
}
