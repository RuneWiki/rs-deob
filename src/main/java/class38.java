import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MWRZAKOJ")
public class class38 {

    @OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "Z")
    private boolean field1195 = false;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "b", descriptor = "I")
    private int field1196 = 6;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "c", descriptor = "Z")
    private boolean field1197 = false;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "d", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "g", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "h", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "i", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "j", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "k", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "l", descriptor = "I")
    private int field1206;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "m", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "n", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "o", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "e", descriptor = "[I")
    private int[] field1199;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "f", descriptor = "[I")
    private int[] field1200;

    @OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "(LIUVBENCV;B)V")
    public final void method358(class25 arg0, byte arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        this.field1203 = arg0.method245();
        this.field1201 = arg0.method250();
        this.field1202 = arg0.method250();
        this.method359(arg0, (byte) 1);
    }

    @OriginalMember(owner = "client!MWRZAKOJ", name = "b", descriptor = "(LIUVBENCV;B)V")
    public final void method359(class25 arg0, byte arg1) {
        this.field1198 = arg0.method245();
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1199 = new int[this.field1198];
        this.field1200 = new int[this.field1198];
        for (int var5 = 0; var5 < this.field1198; var5++) {
            this.field1199[var5] = arg0.method247();
            this.field1200[var5] = arg0.method247();
        }
    }

    @OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "(Z)V")
    public final void method360(boolean arg0) {
        this.field1204 = 0;
        this.field1205 = 0;
        this.field1206 = 0;
        this.field1207 = 0;
        this.field1208 = 0;
        if (!arg0) {
            this.field1197 = !this.field1197;
        }
    }

    @OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "(II)I")
    public final int method361(int arg0, int arg1) {
        if (this.field1208 >= this.field1204) {
            this.field1207 = this.field1200[this.field1205++] << 15;
            if (this.field1205 >= this.field1198) {
                this.field1205 = this.field1198 - 1;
            }
            this.field1204 = (int) ((double) this.field1199[this.field1205] / 65536.0D * (double) arg1);
            if (this.field1204 > this.field1208) {
                this.field1206 = ((this.field1200[this.field1205] << 15) - this.field1207) / (this.field1204 - this.field1208);
            }
        }
        this.field1207 += this.field1206;
        this.field1208++;
        if (arg0 < this.field1196 || arg0 > this.field1196) {
            this.field1195 = !this.field1195;
        }
        int var10000 = this.field1207 - this.field1206 >> 15;
        if (class71.field1729) {
        }
        return var10000;
    }
}
