import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class302 extends class369 {

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4333 = new CRC32();

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "B")
    public byte field4328;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Lqj;")
    public static class238 field4336;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Lil;")
    public class265 field4329;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)I", line = 5)
    public final int method462(int arg0) {
        ++field4334;
        if (this.field4329 == null) {
            return 0;
        } else {
            return arg0 != 2 ? -75 : this.field4329.field3915 * 100 / (this.field4329.field3879.length - this.field4328);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 24)
    public static final void method1910(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field123 != null) {
                var3.field123 = null;
            }
            if (var3.field102 != null) {
                var3.field102 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V", line = 39)
    public static void method1911(int arg0) {
        field4333 = null;
        if (arg0 == 0) {
            field4336 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)[B", line = 52)
    public final byte[] method461(int arg0) {
        ++field4332;
        if (!super.field5481 && ~this.field4329.field3915 <= ~(this.field4329.field3879.length + -this.field4328)) {
            if (arg0 != 6) {
                this.field4335 = 10;
            }
            return this.field4329.field3879;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 71)
    public static final String method1912(int arg0, long arg1) {
        ++field4331;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                if (arg0 != 31013) {
                    return null;
                } else {
                    for (long var4 = arg1; ~var4 != -1L; var4 /= 37L) {
                        ++var3;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (arg1 != 0L) {
                        long var7 = arg1;
                        arg1 /= 37L;
                        var6.append(class17.field205[(int) (-(arg1 * 37L) + var7)]);
                    }
                    return var6.reverse().toString();
                }
            }
        } else {
            return null;
        }
    }
}
