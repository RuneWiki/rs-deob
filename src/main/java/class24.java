import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 extends class195 {

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    private int field246 = -1;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    private int field249 = -1;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Z")
    public static boolean field247 = true;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)[Lqe;", line = 3)
    public static final class469[] method121(int arg0) {
        ++field251;
        if (arg0 != 15513) {
            field247 = false;
        }
        return new class469[] { class658.field9222, class424.field6306, class408.field6151, class389.field5860, class186.field2840, class299.field4245, class81.field1141, class575.field8143, class99.field1421, class602.field8517, class307.field4354, class168.field2642, class58.field799, class488.field6983, class213.field3191, class80.field1131, class374.field5679, class417.field6250, class750.field10484, class390.field5882, class223.field3267, class19.field220, class337.field4913, class353.field5139, class317.field4517, class320.field4521, class650.field9158, class547.field7815, class608.field8605, class381.field5749, class199.field2992, class279.field3947, class581.field8251, class44.field474, class37.field380, class693.field9572, class509.field7255, class252.field3637, class531.field7571, class332.field4770, class44.field479, class707.field9956, class49.field712, class758.field10599, class327.field4663, class382.field5764, class509.field7254, class636.field8933, class501.field7117, class642.field9004, class302.field4286, class359.field5207, class262.field3720, class678.field9430, class717.field10081, class505.field7180, class432.field6442, class59.field839, class228.field3347, class361.field5230, class8.field105, class373.field5534, class367.field5286, class489.field6989, class117.field1601, class130.field1746, class352.field5127, class235.field3418, class253.field3647, class128.field1712, class756.field10577, class352.field5128, class92.field1282, class385.field5814, class323.field4611, class76.field1056, class396.field5939, class566.field8043, class728.field10212, class538.field7690, class99.field1407, class524.field7488, class603.field8533, class379.field5732, class417.field6253, class64.field926, class334.field4822, class571.field8082, class176.field2733, class294.field4195, class356.field5173, class350.field5115, class236.field3423, class492.field7016, class445.field6612, class214.field3195, class502.field7139, class373.field5540, class490.field6994, class406.field6143, class758.field10593, class189.field2868, class692.field9559, class9.field112, class588.field8335, class537.field7684, class535.field7671, class559.field7997, class686.field9484, class673.field9384, class569.field8061, class361.field5221, class441.field6553, class54.field747, class389.field5853, class234.field3402, class133.field1788, class340.field4936, class689.field9512, class530.field7549, class43.field469, class459.field6755 };
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lwh;IIZ[[BI)V", line = 14)
    public class24(class148 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field245 = arg2;
        super.field2967.method1088(this, -27749);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2956, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V", line = 33)
    public final void method122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field250;
        OpenGL.glFramebufferTexture2DEXT(arg4, arg1, arg0, super.field2958, arg3);
        this.field246 = arg1;
        if (arg2 != 34069) {
            field247 = false;
        }
        this.field249 = arg4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 46)
    public final void method106(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field249, this.field246, 3553, 0, 0);
        ++field248;
        this.field249 = -1;
        if (arg0 >= 14) {
            this.field246 = -1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lwh;IIZ[[I)V", line = 59)
    public class24(class148 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field245 = arg2;
        super.field2967.method1088(this, -27749);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class20.method110(arg4[var6], arg2, 32993, 0, arg2, super.field2956, 34069 - -var6, super.field2967.field2265);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(34069 - -var7, 0, super.field2956, arg2, arg2, 0, 32993, super.field2967.field2265, arg4[var7], 0);
            }
        }
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lwh;II)V", line = 93)
    public class24(class148 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field245 = arg2;
        super.field2967.method1088(this, -27749);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2956, arg2, arg2, 0, class307.method1935(-97, super.field2956), 5121, (byte[]) null, 0);
        }
        this.method1362(true, 1287);
    }
}
