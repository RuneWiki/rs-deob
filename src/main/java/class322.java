import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class322 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "F")
    public float field5000 = 0.25F;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "F")
    public float field5008 = 1.0F;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "F")
    public float field5010 = 1.0F;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public int field5004;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "F")
    public float field4998;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "F")
    public float field5012;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public int field5011;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field4995;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "F")
    public float field5014;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lti;")
    public class248 field5013;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field5006 = 0;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5007 = "Take";

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[I")
    public static int[] field5009 = new int[25];

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Luc;")
    public static class212 field5005;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILlf;)V", line = 10)
    public final void method2240(int arg0, class143 arg1) {
        if (arg0 != 16970) {
            method2241((byte) -110);
        }
        this.field5008 = (float) (arg1.method1043(true) * 8) / 255.0F;
        this.field5000 = (float) (arg1.method1043(true) * 8) / 255.0F;
        field5003++;
        this.field5010 = (float) (arg1.method1043(true) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 31)
    public static void method2241(byte arg0) {
        field5005 = null;
        field5007 = null;
        field5009 = null;
        if (arg0 != -100) {
            field5002 = 40;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 69)
    public class322() {
        this.field5004 = -50;
        this.field5001 = 0;
        this.field4998 = 1.1523438F;
        this.field5012 = 0.69921875F;
        this.field4997 = class26.field304;
        this.field5011 = -50;
        this.field4995 = class26.field303;
        this.field4996 = -60;
        this.field5014 = 1.2F;
        if (class218.field3278 != null) {
            this.field5013 = class248.method1760(class218.field3278[0], class218.field3278[1], class218.field3278[2], class218.field3278[3], class218.field3278[4], class218.field3278[5]);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Llf;)V", line = 87)
    public class322(class143 arg0) {
        int var2 = arg0.method1043(true);
        if ((var2 & 0x1) == 0) {
            this.field4997 = class26.field304;
        } else {
            this.field4997 = arg0.method1057(-124);
        }
        if ((var2 & 0x2) == 0) {
            this.field4998 = 1.1523438F;
        } else {
            this.field4998 = (float) arg0.method1051(1) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field5012 = 0.69921875F;
        } else {
            this.field5012 = (float) arg0.method1051(1) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field5014 = 1.2F;
        } else {
            this.field5014 = (float) arg0.method1051(1) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5011 = -50;
            this.field5004 = -50;
            this.field4996 = -60;
        } else {
            this.field5011 = arg0.method1021(-1);
            this.field4996 = arg0.method1021(-1);
            this.field5004 = arg0.method1021(-1);
        }
        if ((var2 & 0x20) == 0) {
            this.field4995 = class26.field303;
        } else {
            this.field4995 = arg0.method1057(-118);
        }
        if ((var2 & 0x40) == 0) {
            this.field5001 = 0;
        } else {
            this.field5001 = arg0.method1051(1);
        }
        if ((var2 & 0x80) != 0) {
            this.field5013 = class248.method1760(arg0.method1051(1), arg0.method1051(1), arg0.method1051(1), arg0.method1051(1), arg0.method1051(1), arg0.method1051(1));
        } else if (class218.field3278 != null) {
            this.field5013 = class248.method1760(class218.field3278[0], class218.field3278[1], class218.field3278[2], class218.field3278[3], class218.field3278[4], class218.field3278[5]);
        }
    }
}
