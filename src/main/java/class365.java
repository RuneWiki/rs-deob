import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class365 extends class5 {

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public volatile int field5598 = -1;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field5597;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field5594 = 0;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5595 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "Lla;")
    public static class319 field5600 = new class319(88, 8);

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5603 = new Rectangle[100];

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Lni;")
    public static class367 field5601 = new class367(82, 7);

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Lji;")
    public static class441 field5599;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 4)
    public static void method2329(int arg0) {
        field5601 = null;
        field5595 = null;
        if (arg0 != 194) {
            method2332(-108, true, -78, 72, 115);
        }
        field5599 = null;
        field5603 = null;
        field5600 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([BIBI)Ljava/lang/String;", line = 21)
    public static final String method2330(byte[] arg0, int arg1, byte arg2, int arg3) {
        field5605++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg1 + arg3;
        if (arg2 != 89) {
            field5600 = null;
        }
        for (int var7 = arg3; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if (var6 <= (var7 + 1)) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg0[var7] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class311.method1956(class519.method3092(-193, var8) << 6, class519.method3092(var9, -129));
                } else if (var8 < 240) {
                    if (var7 + 2 >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var10 = arg0[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var7++;
                        int var11 = arg0[var7] & 0xFF;
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class311.method1956(class311.method1956(class519.method3092(var10, -129) << 6, class519.method3092(-921600, var8 << 12)), class519.method3092(-129, var11));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var8 >= 244) {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                } else {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 120)
    public class365(String arg0) {
        this.field5597 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V", line = 104)
    public static final void method2331(boolean arg0) {
        class424.method2582(class18.field299, -1);
        field5604++;
        if (!arg0) {
            return;
        }
        class423.field6448++;
        class538.field7879.method1072((byte) 102, class325.method2014((byte) 61));
        class538.field7879.method1114(class147.field1961, 87);
        class538.field7879.method1114(class107.field1525, 124);
        class538.field7879.method1072((byte) 102, class203.field2716.field1150);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZIII)V", line = 139)
    public static final void method2332(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5602++;
        if (class86.method587(-125, arg4) && arg2 == -10287) {
            class337.method2184(-1, arg3, class263.field3690[arg4], arg0, arg1, 1);
        }
    }
}
