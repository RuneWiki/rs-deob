import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class103 {

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    private int field1417 = 0;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    private int field1415 = -1;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljm;")
    private class162 field1412 = new class162();

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
    public boolean field1427 = false;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lqb;")
    private class86[] field1420;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[[I")
    private int[][] field1422;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1419 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[S")
    public static short[] field1424 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lhc;")
    public static class368 field1423 = new class368("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[[Lvg;")
    public static class108[][] field1425;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method780(int arg0) {
        if (arg0 < -19) {
            field1423 = null;
            field1419 = null;
            field1424 = null;
            field1425 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)[[I")
    public final int[][] method781(int arg0) {
        field1413++;
        if (this.field1421 != this.field1418) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 32335) {
            this.method782(-35);
        }
        for (int var2 = 0; var2 < this.field1421; var2++) {
            this.field1420[var2] = class369.field5112;
        }
        return this.field1422;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method782(int arg0) {
        for (int var2 = arg0; var2 < this.field1421; var2++) {
            this.field1422[var2] = null;
        }
        field1416++;
        this.field1420 = null;
        this.field1422 = null;
        this.field1412.method1168(124);
        this.field1412 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
    public final int[] method783(int arg0, byte arg1) {
        field1414++;
        int var3 = -76 / ((arg1 - 24) / 51);
        if (this.field1421 == this.field1418) {
            this.field1427 = this.field1420[arg0] == null;
            this.field1420[arg0] = class369.field5112;
            return this.field1422[arg0];
        } else if (this.field1421 == 1) {
            this.field1427 = this.field1415 != arg0;
            this.field1415 = arg0;
            return this.field1422[0];
        } else {
            class86 var4 = this.field1420[arg0];
            if (var4 == null) {
                this.field1427 = true;
                if (this.field1421 <= this.field1417) {
                    class86 var5 = (class86) this.field1412.method1163((byte) 33);
                    var4 = new class86(arg0, var5.field1204);
                    this.field1420[var5.field1205] = null;
                    var5.method1884(false);
                } else {
                    var4 = new class86(arg0, this.field1417);
                    this.field1417++;
                }
                this.field1420[arg0] = var4;
            } else {
                this.field1427 = false;
            }
            this.field1412.method1169(var4, false);
            return this.field1422[var4.field1204];
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
    public class103(int arg0, int arg1, int arg2) {
        this.field1421 = arg0;
        this.field1418 = arg1;
        this.field1420 = new class86[this.field1418];
        this.field1422 = new int[this.field1421][arg2];
    }
}
