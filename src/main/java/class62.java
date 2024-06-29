import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 extends class37 {

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lo;")
    public static class84 field1279 = class15.method124("Please try again)3", 255);

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lo;")
    public static class84 field1282 = class15.method124("Private chat", 255);

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lo;")
    public static class84 field1281 = class15.method124("You have ", 255);

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Lcb;")
    public class15 field1292;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Lad;")
    public class5 field1291;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lqb;")
    public static class96 field1280;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Lqb;")
    public static class96 field1287;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lqd;")
    public static class98 field1284;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "[B")
    public byte[] field1285;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 25)
    public static void method488(int arg0) {
        field1284 = null;
        field1287 = null;
        field1281 = null;
        field1280 = null;
        field1279 = null;
        field1282 = null;
        int var1 = -110 / ((arg0 - 68) / 43);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Lo;", line = 70)
    public static final class84 method489(int arg0, byte arg1) {
        if (arg1 > -123) {
            field1287 = null;
        }
        field1288++;
        return class101.method759(false, 10, arg0, 1);
    }
}
