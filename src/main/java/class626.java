import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class626 {

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "Lsga;")
    public class70 field8608 = null;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "[Lbq;")
    public class293[] field8604 = null;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "[Lbq;")
    public class293[] field8607 = null;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "Lsga;")
    public class70 field8606 = null;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "Lsga;")
    public class70 field8609 = null;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "Z")
    public boolean field8605;

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I[FB)[F", line = 3)
    public static final float[] method3508(int arg0, float[] arg1, byte arg2) {
        field8610++;
        float[] var3 = new float[arg0];
        class135.method998(arg1, 0, var3, 0, arg0);
        return arg2 == 96 ? var3 : null;
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lbi;)V", line = 41)
    public class626(class483 arg0) {
        this.field8605 = arg0.field6851;
        class329.method1911((byte) -104, arg0);
        if (this.field8605) {
            byte[] var2 = class98.method784(false, class438.field5834, 3544);
            this.field8608 = new class70(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class98.method784(false, class702.field9766, 3544);
            this.field8606 = new class70(arg0, 6410, 128, 128, 16, var3, 6410);
            class338 var4 = arg0.field6777;
            if (var4.method1946(26780)) {
                byte[] var5 = class98.method784(false, class211.field2794, 3544);
                this.field8609 = new class70(arg0, 6408, 128, 128, 16);
                class70 var6 = new class70(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1944(2.0F, var6, this.field8609, true)) {
                    this.field8609.method3896((byte) -125);
                } else {
                    this.field8609.method3895(35);
                    this.field8609 = null;
                }
                var6.method3895(122);
                return;
            }
        } else {
            this.field8607 = new class293[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class28.method191(class438.field5834, false, 32768, var7 * 2 * 128 * 128);
                this.field8607[var7] = new class293(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field8604 = new class293[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class28.method191(class702.field9766, false, 32768, var8 * 128 * 256);
                this.field8604[var8] = new class293(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
