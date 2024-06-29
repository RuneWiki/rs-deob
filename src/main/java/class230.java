import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class230 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
    public static boolean field3252 = false;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ll;")
    public static class16 field3253;

    static {
        new class466("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)[Lwj;", line = 3)
    public static final class270[] method1422(byte arg0) {
        if (arg0 != -91) {
            field3253 = null;
        }
        field3250++;
        return new class270[] { class53.field648, class424.field6218, class388.field5657, class288.field4000, class59.field714, class65.field897, class214.field2984, class26.field333, class85.field1263, class64.field858, class359.field5231, class407.field5949, class38.field478, class222.field3165, class434.field6362, class5.field46, class408.field5963, class279.field3816, class70.field973, class55.field659, class202.field2845, class147.field2117, class254.field3531, class511.field7574, class218.field3042, class423.field6202, class526.field7792, class20.field263, class100.field1503, class479.field7002, class265.field3664, class372.field5442, client.field2802, class264.field3646, class100.field1496, class204.field2868, class65.field886, class146.field2079, class490.field7164, class58.field675, class258.field3598, class9.field147, class118.field1756, class37.field465, class26.field346, class122.field1829, class385.field5607, class323.field4398, class520.field7703, class461.field6773, class51.field618, class408.field5970, class446.field6575, class317.field4332, class446.field6577, class359.field5237, class21.field286, class486.field7094, class134.field1946, class251.field3471, class418.field6059, class129.field1910, class210.field2928, class487.field7126, class58.field694, class343.field4932, class318.field4370, class446.field6574, class19.field248, class416.field6050, class487.field7129, class225.field3204, class136.field1957, class49.field580, class309.field4209, class383.field5594, class489.field7138, class473.field6904, class314.field4293, class508.field7551, class287.field3987, class448.field6605, class140.field1986, class216.field3003, class236.field3346, class20.field268, class6.field110, class431.field6334, class231.field3262, class285.field3939, class506.field7458, class459.field6734, class126.field1875, class386.field5638, class87.field1270, class331.field4508, class289.field4003, class278.field3808, class61.field761, class242.field3390, class57.field672, class410.field5991, class96.field1462, class113.field1693, class419.field6105, class217.field3025, class323.field4399, class240.field3368, class484.field7077, class397.field5790 };
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 16)
    public static void method1423(int arg0) {
        field3253 = null;
        if (arg0 <= 5) {
            field3253 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILmg;)Lea;", line = 42)
    public static final class382 method1424(int arg0, int arg1, class101 arg2) {
        field3249++;
        byte[] var3 = arg2.method742(arg1, arg0 - 12715);
        if (arg0 != 12716) {
            method1424(70, 65, null);
        }
        return var3 == null ? null : new class382(var3);
    }
}
