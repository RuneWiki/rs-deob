import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class295 extends class431 {

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Z")
    public boolean field4495;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "J")
    public long field4494;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Ljava/lang/String;")
    public String field4491;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Z")
    public boolean field4490;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Ljava/lang/String;")
    public String field4499;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lqd;")
    public static class315 field4502 = new class315("", 17);

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "J")
    public static long field4505 = 0L;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Loe;")
    public static class137 field4504 = new class137();

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 18)
    public static void method1919(byte arg0) {
        field4504 = null;
        if (arg0 != -101) {
            method1919((byte) 51);
        }
        field4502 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 34)
    public static final String method1920(long arg0, int arg1) {
        if (arg1 != -1445) {
            field4504 = null;
        }
        field4501++;
        class77.field1109.setTime(new Date(arg0));
        int var3 = class77.field1109.get(7);
        int var4 = class77.field1109.get(5);
        int var5 = class77.field1109.get(2);
        int var6 = class77.field1109.get(1);
        int var7 = class77.field1109.get(11);
        int var8 = class77.field1109.get(12);
        int var9 = class77.field1109.get(13);
        return class179.field2695[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class120.field1809[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 59)
    public class295(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4497 = arg6;
        this.field4495 = arg9;
        this.field4493 = arg7;
        this.field4503 = arg4;
        this.field4494 = arg5;
        this.field4491 = arg1;
        this.field4490 = arg8;
        this.field4498 = arg3;
        this.field4500 = arg2;
        this.field4499 = arg0;
    }
}
