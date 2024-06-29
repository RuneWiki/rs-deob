import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class286 extends class35 {

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Ldj;")
    public static class304 field4284;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "[[I")
    public static int[][] field4283;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static void method2019(int arg0) {
        field4283 = null;
        if (arg0 < -54) {
            field4284 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lon;Lon;B)V")
    public static final void method2020(class35 arg0, class35 arg1, byte arg2) {
        if (arg1.field497 != null) {
            arg1.method251(21);
        }
        field4282++;
        arg1.field497 = arg0.field497;
        arg1.field498 = arg0;
        arg1.field497.field498 = arg1;
        if (arg2 >= -82) {
            method2019(91);
        }
        arg1.field498.field497 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2021(int arg0, String arg1, boolean arg2) {
        field4289++;
        boolean var3 = false;
        if (!arg2) {
            method2019(-66);
        }
        for (int var4 = 0; var4 < class21.field317; var4++) {
            class127 var5 = class367.field5225[class75.field1290[var4]];
            if (var5 != null && var5.field2066 != null && var5.field2066.equalsIgnoreCase(arg1)) {
                var3 = true;
                if (arg0 == 1) {
                    class13.field216.method2781(false, 31);
                    class239.field3453++;
                    class13.field216.method277(0, (byte) -74);
                    class13.field216.method260(class75.field1290[var4], (byte) 104);
                } else if (arg0 == 4) {
                    class171.field2547++;
                    class13.field216.method2781(false, 99);
                    class13.field216.method267(0, false);
                    class13.field216.method319(class75.field1290[var4], (byte) -38);
                } else if (arg0 == 5) {
                    class23.field344++;
                    class13.field216.method2781(!arg2, 53);
                    class13.field216.method319(class75.field1290[var4], (byte) -86);
                    class13.field216.method289(0, -7196);
                } else if (arg0 == 6) {
                    class13.field216.method2781(!arg2, 178);
                    class415.field6009++;
                    class13.field216.method267(0, false);
                    class13.field216.method324(class75.field1290[var4], -66);
                } else if (arg0 == 7) {
                    class13.field216.method2781(false, 115);
                    class132.field2130++;
                    class13.field216.method260(class75.field1290[var4], (byte) 121);
                    class13.field216.method277(0, (byte) 116);
                }
                break;
            }
        }
        if (!var3) {
            class373.method2380(19380, class220.field3272 + arg1);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V")
    public class286(int arg0, int arg1) {
        this.field4287 = arg0;
        this.field4286 = arg1;
    }
}
