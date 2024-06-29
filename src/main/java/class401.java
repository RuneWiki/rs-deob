import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class401 {

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field6190;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field6187;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field6188 = -1;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lrl;")
    public static class672 field6186 = new class672(81, 4);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Laf;", line = 5)
    public final class401 method2576(int arg0, byte arg1) {
        if (arg1 <= 13) {
            field6186 = null;
        }
        field6184++;
        return new class401(this.field6190, arg0, this.field6185, this.field6187);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BLjava/io/File;I)V", line = 19)
    public static final void method2577(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        field6183++;
        if (arg0 != 4) {
            method2579(105);
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lpn;[Lcp;)V", line = 36)
    public static final void method2578(class692 arg0, class674[] arg1) {
        if (class502.field7355) {
            int var2 = arg0.method1473((byte) -44, arg1);
            class595.field8435.method327(var2, arg1);
        }
        if (class587.field8346 == class493.field7208) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class459) {
                var5 = ((class459) arg0).field6865;
                var6 = ((class459) arg0).field6869;
            } else {
                var5 = arg0.field9696 >> class439.field6699;
                var6 = arg0.field9705 >> class439.field6699;
            }
            class595.field8435.method309(class491.field7187[0].method477(-1, arg0.field9705, arg0.field9696), class389.method2526(var5, var6), class379.method2497(var5, var6), class441.method2786(var5, var6));
        }
        class468 var7 = arg0.method403(-110, class595.field8435);
        if (var7 == null) {
            return;
        }
        var7.field6949 = arg0;
        if (class413.field6343) {
            class433 var8 = class485.field7108;
            synchronized (class485.field7108) {
                boolean var9 = false;
                for (class468 var10 = (class468) class485.field7108.method2754((byte) 127); var10 != null; var10 = (class468) class485.field7108.method2759(1486415172)) {
                    if (arg0.field9699 >= var10.field6949.field9699) {
                        class1.method7(var10, (byte) -124, var7);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class485.field7108.method2757(var7, -1);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class468 var12 = (class468) class485.field7108.method2754((byte) 122); var12 != null; var12 = (class468) class485.field7108.method2759(1486415172)) {
            if (arg0.field9699 >= var12.field6949.field9699) {
                class1.method7(var12, (byte) -109, var7);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class485.field7108.method2757(var7, -1);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 120)
    public static void method2579(int arg0) {
        field6186 = null;
        if (arg0 >= -29) {
            method2579(-84);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIII)V", line = 141)
    public class401(int arg0, int arg1, int arg2, int arg3) {
        this.field6190 = arg0;
        this.field6189 = arg1;
        this.field6187 = arg3;
        this.field6185 = arg2;
    }
}
