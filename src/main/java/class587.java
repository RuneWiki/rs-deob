import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class587 extends class108 {

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public int field8364;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public int field8369;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Z")
    public boolean field8362;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field8359;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Ljava/lang/String;")
    public String field8370;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field8367;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field8368;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "J")
    public long field8365;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Z")
    public boolean field8358;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Ljava/lang/String;")
    public String field8360;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Liu;")
    public static class517 field8366 = new class517(51, 8);

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[Lsa;")
    public static class542[] field8363;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method3364(int arg0) {
        field8366 = null;
        int var1 = 61 / ((arg0 + 20) / 56);
        field8363 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static final void method3365(int arg0) {
        field8361++;
        if (class64.field893 == 6) {
            class271.method1759(false, 4);
            return;
        }
        class117.field1905 = client.field8770;
        client.field8770 = null;
        if (arg0 >= 10) {
            class307.method1904(true, 12);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class587(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field8364 = arg2;
        this.field8369 = arg6;
        this.field8362 = arg8;
        this.field8359 = arg3;
        this.field8370 = arg1;
        this.field8367 = arg7;
        this.field8368 = arg4;
        this.field8365 = arg5;
        this.field8358 = arg9;
        this.field8360 = arg0;
    }
}
