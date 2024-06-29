import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class561 extends class344 {

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "Z")
    private boolean field8140 = false;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "Lnl;")
    private class578 field8151;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Lnl;")
    private class578 field8147;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "Lnl;")
    private class578 field8149;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lnl;")
    private class578 field8145;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Z")
    private boolean field8150;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "Lkia;")
    private class649 field8144;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field8160 = new String[] { method4127(method4126("\u0016WE\u00163")), method4127(method4126("\u0016WE\u001e3")), method4127(method4126("\u0016WE\u00103")), method4127(method4126("\u0016WE\u00113")), method4127(method4126("\u0016WE\u001f3")), method4127(method4126("\u0019\tEyf")), method4127(method4126("\fR\u0007;")), method4127(method4126("\u0016WE\u00153")), method4127(method4126("\u0016WE\u00133")), method4127(method4126("\u0016WE\u001b3")), method4127(method4126("C\u0006*\u0005Y\u0014WZy+hf?\u0003I+eKwr2H\u0018w;B\u0007Kw;B\u0007Vwm\u0007U\u001f2cLW\u0004$r\u0016N\u00049 hf?\u0003I+eKwr!H\u00078n\u0010\u0007Kw;B\u0007Vwm\u0007U\u001f2cLD\u0004;t\u0010\u001ca\u0016O6u\"\u0015;BN?2c!H\u0004%\u007fB\u0007Kw&BQ\u000e%o\u0007_E#~\u001aD\u00048i\u0006|[\n hh>\u0003K7sKwt2H\u0018w;B\u0007Kw;B\u0007Vwi\u0007T\u001e;oLW\u0004$r\u0016N\u00049 hh>\u0003K7sKwt!H\u00078n\u0010\u0007Kw;B\u0007Vwi\u0007T\u001e;oLD\u0004;t\u0010\u001ca\u0018N6w>\u0003;BH?2c!H\u0004%\u007fR\u0007Kw&BU\u000e$n\u000eSE#~\u001aD\u00048i\u0006|[\n hh>\u0003K7sKwt6B\u0013\u0014t\rU\u000ff;B\u0007Vwi\u0007T\u001e;oLS\u000e/x\rH\u00193@SzP]T7s;\u0002OB\u0007\u0004\u0011t\u0005d\u00048i\u0006\u0007Kw;_\u0007\u00192h\u0017K\u001fy}\r@\b8t\u0010CP]K#u*\u001a;B\u0007\r8|2F\u00196v\u0011\u0007Kw;_\u0007\u001b%t\u0005U\n:5\u000eH\b6w9\u00176l\u00112f9\u0016VB\u0007K z\u0016B\u0019\u0007w\u0003I\u000ew;B\u001aK'i\r@\u00196vLK\u00044z\u000e|Z\n hw*\u0005Z/\u0007Kwk/F\u001f%r\u001a|_\n;B\u0007Vw`BT\u001f6o\u0007\t\u00066o\u0010N\u0013yk\u0010H\u00012x\u0016N\u00049;\u001f\u001ca\u0007Z0f&w;BJ\u001d\u001az\u0016U\u0002/@VzKw&B\\K$o\u0003S\u000eyv\u0003S\u0019>cLJ\u00043~\u000eQ\u00022lBZP]K#u*\u001a;B\u0007\u001f2c/F\u001f%r\u001a|_\n;_\u0007\u0010wh\u0016F\u001f25\u000fF\u001f%r\u001a\t\u001f2c\u0016R\u00192@RzK* hs.\u001aKB\u0007Kwm\u000bB\u001c\u0007t\u0011\u000bK1t\u0005a\n4o\rUGw\u007f\u0007W\u001f? hc;c;B\u0007\u001d>~\u0015w\u0004$5\u001a\u000bK:m/F\u001f%r\u001a|[\n7BN;8hY-/\u0007/B\u0007K!r\u0007P;8hL^Gwv\u0014j\n#i\u000b_0fFN\u0007\u0002\u0007t\u0011\u001ca\u0013KV\u0007Kwm\u000bB\u001c\u0007t\u0011\t\u0011{;\u000fQ&6o\u0010N\u0013\f)?\u000bK>K\rTP]_2\u0013Kw;\u0014N\u000e K\rTE 7BJ\u001d\u001az\u0016U\u0002/@QzGwr2H\u0018l\u00111r)w;BA\u00040]\u0003D\u001f8iL_Gw6\u0014N\u000e K\rTE-7BA\u00040K\u0003U\n:hL_P]V7kKw;\u0004H\f\u0011z\u0001S\u0004%5\u001a\u000bK1t\u0005a\n4o\rUE/7B\u0017Eg+S\u001e^d*P\u0012P]_2\u0013Kw;\u0006B\u001b#sN\u0007\u001c6o\u0007U;;z\fBGwm\u000bB\u001c\u0007t\u0011\u001ca\u001aZ&\u0007Kw}\r@-6x\u0016H\u0019ybN\u0007F3~\u0012S\u0003{;\u0004H\f\u0007z\u0010F\u0006$5\u0018\u000bK1t\u0005w\n%z\u000fTE  ht>\u0015;B\u0007\r8|$F\b#t\u0010\t\u0011{;OQ\u00022l2H\u0018yaN\u0007\r8|2F\u00196v\u0011\t\u0012l\u0011/r'w;BA\u00040]\u0003D\u001f8iL]Gw}\r@-6x\u0016H\u0019yaN\u0007[y+R\u0014Rg-P\u0012P]V+iKw;\u0004H\f\u0011z\u0001S\u0004%7BA\u00040]\u0003D\u001f8iN\u0007Zl\u0011/f3w;BA\u00040]\u0003D\u001f8iN\u0007\r8|$F\b#t\u0010\u000bKg hj>\u001b;B\u0007\r8|$F\b#t\u0010\t\u0011{;\u0004H\f\u0011z\u0001S\u0004%5\u0018\u000bKz\u007f\u0007W\u001f? hj*\u0013;B\u0007\u001d>~\u0015w\u0004$5\u001a^\u0011{;\u0015F\u001f2i2K\n9~L_\u0012-lN\u0007\r8|$F\b#t\u0010\t\u0011-a\u0018\u000bK!r\u0007P;8hL_\u0012-lY-&\u0016CB\u0007K8O\u0007_(8t\u0010CZyc\u001b]Gw}\r@-6x\u0016H\u0019yc\u001a_\u0013{;\u0004H\f\u0011z\u0001S\u0004%5\u001b^\u0012. hj$\u0001;B\u0007\u0004\u0003~\u001ad\u00048i\u0006\u0016E 7B\u0016P]V-qKw;\rd\u0004;t\u0017UGwr!H\u00078n\u0010\u001ca\u0013KV\u0007Kwt2H\u0018ycN\u0007\u001b\u001az\u0016U\u0002/@RzGwm\u000bB\u001c\u0007t\u0011\u001ca\u0013KV\u0007Kwt2H\u0018ybN\u0007\u001b\u001az\u0016U\u0002/@SzGwm\u000bB\u001c\u0007t\u0011\u001ca\u0013KV\u0007Kwt2H\u0018yaN\u0007\u001b\u001az\u0016U\u0002/@PzGwm\u000bB\u001c\u0007t\u0011\u001ca\u0013KV\u0007Kwt2H\u0018ylN\u0007\u001b\u001az\u0016U\u0002/@QzGwm\u000bB\u001c\u0007t\u0011\u001ca\u001aT4\u0007Kwt$H\f\u0014t\rU\u000fycN\u0007\u001d>~\u0015w\u0004$5\u0018\u001ca\u0013KV\u0007Kwt6B\u0013\u0014t\rU\u000fg5\u001a\u000bK#~\u001aj\n#i\u000b_0gFN\u0007\u0002\u0003~\u001ad\u00048i\u0006\u001ca\u0013KV\u0007Kwt6B\u0013\u0014t\rU\u000fg5\u001b\u000bK#~\u001aj\n#i\u000b_0fFN\u0007\u0002\u0003~\u001ad\u00048i\u0006\u001ca\u0013KV\u0007Kwt6B\u0013\u0014t\rU\u000fg5\u0018\u000bK#~\u001aj\n#i\u000b_0eFN\u0007\u0002\u0003~\u001ad\u00048i\u0006\u001ca\u001aT4\u0007Kwt6B\u0013\u0014t\rU\u000fg5\u0015\u000bKf hb%\u0013\u0011")), method4127(method4126("C\u0006*\u0005Y\u0014WZy+hf?\u0003I+eKwr2H\u0018w;B\u0007Kw;B\u0007Vwm\u0007U\u001f2cLW\u0004$r\u0016N\u00049 hf?\u0003I+eKwr!H\u00078n\u0010\u0007Kw;B\u0007Vwm\u0007U\u001f2cLD\u0004;t\u0010\u001ca\u0016O6u\"\u0015;BN?2c!H\u0004%\u007fB\u0007Kw&BQ\u000e%o\u0007_E#~\u001aD\u00048i\u0006|[\n hh>\u0003K7sKwt2H\u0018w;B\u0007Kw;B\u0007Vwi\u0007T\u001e;oLW\u0004$r\u0016N\u00049 hh>\u0003K7sKwt!H\u00078n\u0010\u0007Kw;B\u0007Vwi\u0007T\u001e;oLD\u0004;t\u0010\u001ca\u0018N6w>\u0003;BH?2c!H\u0004%\u007fR\u0007Kw&BU\u000e$n\u000eSE#~\u001aD\u00048i\u0006|[\n hh>\u0003K7sKwt6B\u0013\u0014t\rU\u000ff;B\u0007Vwi\u0007T\u001e;oLS\u000e/x\rH\u00193@SzP]T7s;\u0002OB\u0007\u0004\u0011t\u0005d\u00048i\u0006\u0007Kw;_\u0007\u00192h\u0017K\u001fy}\r@\b8t\u0010CP]K#u*\u001a;B\u0007\r8|2F\u00196v\u0011\u0007Kw;_\u0007\u001b%t\u0005U\n:5\u000eH\b6w9\u00176l\u00112f9\u0016VB\u0007K z\u0016B\u0019\u0007w\u0003I\u000ew;B\u001aK'i\r@\u00196vLK\u00044z\u000e|Z\n hw*\u0005Z/\u0007Kwo/F\u001f%r\u001a|_\n;B\u0007Vw`BT\u001f6o\u0007\t\u00066o\u0010N\u0013yo\u0007_\u001f\"i\u0007|[\n;\u001f\u001ca\u0007Z0f&w;BW&6o\u0010N\u0013\f/?\u0007Kw&B\\K$o\u0003S\u000eyv\u0003S\u0019>cLW\u00198q\u0007D\u001f>t\f\u0007\u0016l\u00112f9\u0016VB\u0007K:m/F\u001f%r\u001a|_\n;B\u001aK,;\u0011S\n#~LJ\n#i\u000b_E:t\u0006B\u0007!r\u0007PK* hs.\u001aKB\u0007Kwm\u000bB\u001c\u0007t\u0011\u000bK1t\u0005a\n4o\rUP]_2\u0013Kw;\u0014N\u000e K\rTE/7BJ\u001d\u001az\u0016U\u0002/@RzGwr2H\u0018l\u0011&w_w;BQ\u00022l2H\u0018ybN\u0007\u0006!V\u0003S\u0019>c9\u00166{;\u000bw\u0004$ hc;c;B\u0007\u001d>~\u0015w\u0004$5\u0018\u000bK:m/F\u001f%r\u001a|Y\n7BN;8hY-/\u0007/B\u0007K!r\u0007P;8hLPGwv\u0014j\n#i\u000b_0dFN\u0007\u0002\u0007t\u0011\u001ca\u0004N \u0007Kw}\r@-6x\u0016H\u0019ycN\u0007F!r\u0007P;8hL]Gw}\r@;6i\u0003J\u0018ycY-&\u0002WB\u0007K1t\u0005a\n4o\rUE/7BA\u00040]\u0003D\u001f8iL_Gw+L\u0017[f\"W\u0014Ze.Y-&\u0016_B\u0007K1t\u0005a\n4o\rUE.7BN?2c!H\u0004%\u007fL]Gw}\r@;6i\u0003J\u0018yaN\u0007\r8|2F\u00196v\u0011\t\u001cl\u00111r)w;BA\u00040]\u0003D\u001f8iL]Gw6\u0014N\u000e K\rTE-7BA\u00040K\u0003U\n:hL^P]V7kKw;\u0004H\f\u0011z\u0001S\u0004%5\u0018\u000bK1t\u0005a\n4o\rUE-7B\u0017Eg+Q\u001e[a)W\u001ca\u001aN.\u0007Kw}\r@-6x\u0016H\u0019ycN\u0007\r8|$F\b#t\u0010\t\u0013{;\u0004H\f\u0011z\u0001S\u0004%5\u001b\u001ca\u001aR,\u0007Kw}\r@-6x\u0016H\u0019{;\u0004H\f\u0011z\u0001S\u0004%7B\u0016P]V#\u007fKw;\u0004H\f\u0011z\u0001S\u0004%7BA\u00040]\u0003D\u001f8iN\u0007[l\u0011/r'w;BA\u00040]\u0003D\u001f8iL]Gw}\r@-6x\u0016H\u0019yaN\u0007\u0002\u0003~\u001ad\u00048i\u0006\t\u0011l\u0011/f/w;BQ\u00022l2H\u0018yc\u001b]Gwl\u0003S\u000e%K\u000eF\u000525\u001a^\u0011 7BA\u00040]\u0003D\u001f8iL]\u0011-aN\u0007\u001d>~\u0015w\u0004$5\u001a^\u0011  hj*\u000f;B\u0007\u0004\u0003~\u001ad\u00048i\u0006\u0016E/b\u0018\u000bK1t\u0005a\n4o\rUE/c\u001a_Gw}\r@-6x\u0016H\u0019yb\u001b^\u0012l\u0011/h=w;BH?2c!H\u0004%\u007fS\t\u001c{;S\u001ca\u001aT4\u0007Kwt!H\u00078n\u0010\u000bK>X\rK\u0004\"iY-/\u0007/B\u0007K8K\rTE/7BW&6o\u0010N\u0013\f+?\u000bK!r\u0007P;8hY-/\u0007/B\u0007K8K\rTE.7BW&6o\u0010N\u0013\f*?\u000bK!r\u0007P;8hY-/\u0007/B\u0007K8K\rTE-7BW&6o\u0010N\u0013\f)?\u000bK!r\u0007P;8hY-/\u0007/B\u0007K8K\rTE 7BW&6o\u0010N\u0013\f(?\u000bK!r\u0007P;8hY-&\u0018MB\u0007K8]\r@(8t\u0010CE/7BQ\u00022l2H\u0018yaY-/\u0007(B\u0007K8O\u0007_(8t\u0010C[ycN\u0007\u001f\u001az\u0016U\u0002/@RzGwr6B\u0013\u0014t\rU\u000fl\u0011&wXw;BH?2c!H\u0004%\u007fR\t\u0012{;\u0016j\n#i\u000b_0fFN\u0007\u0002\u0003~\u001ad\u00048i\u0006\u001ca\u001aT4\u0007Kwt6B\u0013\u0014t\rU\u000fg5\u0018PGwr6B\u0013\u0014t\rU\u000fl\u0011'i/]")), method4127(method4126("\u0016WEkr\fN\u001fi3")), method4127(method4126("C\u0006*\u0005Y\u0014WZy+hf?\u0003I+eKwr2H\u0018w;B\u0007Kw;B\u0007Vwm\u0007U\u001f2cLW\u0004$r\u0016N\u00049 hf?\u0003I+eKwr,H\u0019:z\u000e\u0007Kw;B\u0007Vwm\u0007U\u001f2cLI\u0004%v\u0003KP]Z6s9\u001eYB\u0007\u0002\u0014t\u000eH\u001e%;B\u0007Kw;_\u0007\u001d2i\u0016B\u0013yx\rK\u0004% hf?\u0003I+eKwr6B\u0013\u0014t\rU\u000fw;B\u0007Vwm\u0007U\u001f2cLS\u000e/x\rH\u00193@RzP]T7s;\u0002OB\u0007\u0004\u0007t\u0011\u0007Kw;B\u0007Kw;_\u0007\u00192h\u0017K\u001fyk\rT\u0002#r\rIP]T7s;\u0002OB\u0007\u0004\u0014t\u000eH\u001e%;B\u0007Kw;_\u0007\u00192h\u0017K\u001fyx\rK\u0004% hh>\u0003K7sKwt6B\u0013\u0014t\rU\u000fg;B\u0007Vwi\u0007T\u001e;oLS\u000e/x\rH\u00193@RzP]T7s;\u0002OB\u0007\u0004\u0003~\u001ad\u00048i\u0006\u0016Kw;_\u0007\u00192h\u0017K\u001fyo\u0007_\b8t\u0010C0fFY-$\u0002O2r?w;\ra\u00040X\rH\u00193;B\u0007Kj;\u0010B\u0018\"w\u0016\t\r8|\u0001H\u0004%\u007fY-;\u0016I#jKw;\u0004H\f\u0007z\u0010F\u0006$;B\u0007Kj;\u0012U\u00040i\u0003JE;t\u0001F\u0007\f+?\u001ca\u0007Z0f&w;BP\n#~\u0010w\u00076u\u0007\u0007Kw&BW\u00198|\u0010F\u0006yw\rD\n;@SzP]K#u*\u001a;B\u0007\u001f\u001az\u0016U\u0002/@VzKw;_\u0007\u0010wh\u0016F\u001f25\u000fF\u001f%r\u001a\t\u001f2c\u0016R\u00192@RzK* hw*\u0005Z/\u0007Kwk/F\u001f%r\u001a|_\n;B\u0007Vw`BT\u001f6o\u0007\t\u00066o\u0010N\u0013yk\u0010H\u00012x\u0016N\u00049;\u001f\u001ca\u0007Z0f&w;BJ\u001d\u001az\u0016U\u0002/@VzKw&B\\K$o\u0003S\u000eyv\u0003S\u0019>cLJ\u00043~\u000eQ\u00022lBZP]O'j;w;B\u0007\u001d>~\u0015w\u0004$7BQ\u00022l,H\u0019:z\u000e\u000bK1t\u0005a\n4o\rUGwx\rK\u0004\"iN\u0007\u00053t\u0016KP]_2\u0013Kw;\u0014N\u000e K\rTE/7BJ\u001d\u001az\u0016U\u0002/@RzGwr2H\u0018l\u0011&w_w;BQ\u00022l2H\u0018ybN\u0007\u0006!V\u0003S\u0019>c9\u00166{;\u000bw\u0004$ hc;c;B\u0007\u001d>~\u0015w\u0004$5\u0018\u000bK:m/F\u001f%r\u001a|Y\n7BN;8hY-/\u0007/B\u0007K!r\u0007P;8hLPGwv\u0014j\n#i\u000b_0dFN\u0007\u0002\u0007t\u0011\u001ca\u0004N \u0007Kw}\r@-6x\u0016H\u0019ycN\u0007F!r\u0007P;8hL]Gw}\r@;6i\u0003J\u0018ycY-&\u0002WB\u0007K1t\u0005a\n4o\rUE/7BA\u00040]\u0003D\u001f8iL_Gw+L\u0017[f\"W\u0014Ze.Y-&\u0016_B\u0007K1t\u0005a\n4o\rUE.7BN?2c!H\u0004%\u007fL]Gw}\r@;6i\u0003J\u0018yaN\u0007\r8|2F\u00196v\u0011\t\u001cl\u00111r)w;BA\u00040]\u0003D\u001f8iL]Gw6\u0014N\u000e K\rTE-7BA\u00040K\u0003U\n:hL^P]V7kKw;\u0004H\f\u0011z\u0001S\u0004%5\u0018\u000bK1t\u0005a\n4o\rUE-7B\u0017Eg+Q\u001e[a)W\u001ca\u001aN.\u0007Kw}\r@-6x\u0016H\u0019ycN\u0007\r8|$F\b#t\u0010\t\u0013{;\u0004H\f\u0011z\u0001S\u0004%5\u001b\u001ca\u001aR,\u0007Kw}\r@-6x\u0016H\u0019{;\u0004H\f\u0011z\u0001S\u0004%7B\u0016P]V#\u007fKw;\u0004H\f\u0011z\u0001S\u0004%7BA\u00040]\u0003D\u001f8iN\u0007[l\u0011/r'w;BA\u00040]\u0003D\u001f8iL]Gw}\r@-6x\u0016H\u0019yaN\u0007\u0002\u0003~\u001ad\u00048i\u0006\t\u0011l\u0011/f/w;BQ\u00022l2H\u0018yc\u001b]Gwl\u0003S\u000e%K\u000eF\u000525\u001a^\u0011 7BA\u00040]\u0003D\u001f8iL]\u0011-aN\u0007\u001d>~\u0015w\u0004$5\u001a^\u0011  hj*\u000f;B\u0007\u0004\u0003~\u001ad\u00048i\u0006\u0016E/b\u0018\u000bK1t\u0005a\n4o\rUE/c\u001a_Gw}\r@-6x\u0016H\u0019yb\u001b^\u0012l\u0011/h=w;BH?2c!H\u0004%\u007fS\t\u001c{;S\u001ca\u0013KQ\u0007Kwm\u000bB\u001c\u0019t\u0010J\n;5\u001a\u000bK:m/F\u001f%r\u001a|[\n7BN%8i\u000fF\u0007l\u0011&wXw;BQ\u00022l,H\u0019:z\u000e\t\u0012{;\u000fQ&6o\u0010N\u0013\f*?\u000bK>U\rU\u00066wY-/\u0007(B\u0007K!r\u0007P%8i\u000fF\u0007yaN\u0007\u0006!V\u0003S\u0019>c9\u00156{;\u000bi\u0004%v\u0003KP]_2\u0014Kw;\fC\u0004#wL_Gwm\u000bB\u001c\u0019t\u0010J\n;7BT\u001f6o\u0007\t\u0007>|\nS0gFLW\u0004$r\u0016N\u00049 hc;d;B\u0007\u00053t\u0016KE.7BQ\u00022l,H\u0019:z\u000e\u000bK$o\u0003S\u000eyw\u000b@\u0003#@SzE't\u0011N\u001f>t\f\u001ca\u001aZ:\u0007Kwu\u0006H\u001f;7BI\u000f8o\u000e\u000bKg hj$\u0001;B\u0007\b8w\rR\u0019{;\u0011S\n#~LK\u00020s\u0016J\u00043~\u000e\t\n:y\u000bB\u0005# hj*\u0013;B\u0007\b8w\rR\u0019{;\u0011S\n#~LK\u00020s\u0016|[\n5\u0006N\r1n\u0011BGwu\u0006H\u001f;5\u001a_\u0013/7BD\u0004;t\u0017UP]V#cKw;\u0001H\u00078n\u0010\u000bK$o\u0003S\u000eyw\u000b@\u0003#@SzE3r\u0004A\u001e$~N\u0007\u00053t\u0016KE.b\u001b^Gwx\rK\u0004\"iY-&\u0002WB\u0007K8X\rK\u0004\"iN\u0007\u0002\u0014t\u000eH\u001e%7BD\u0004;t\u0017UP]_2\u0013Kw;\rw\u0004$5\u001a\u000bK'V\u0003S\u0019>c9\u00176{;\u0014N\u000e K\rTP]_2\u0013Kw;\rw\u0004$5\u001b\u000bK'V\u0003S\u0019>c9\u00166{;\u0014N\u000e K\rTP]_2\u0013Kw;\rw\u0004$5\u0018\u000bK'V\u0003S\u0019>c9\u00156{;\u0014N\u000e K\rTP]_2\u0013Kw;\rw\u0004$5\u0015\u000bK'V\u0003S\u0019>c9\u00146{;\u0014N\u000e K\rTP]V-qKw;\ra\u00040X\rH\u001935\u001a\u000bK!r\u0007P;8hL]P]_2\u0014Kw;\rs\u000e/X\rH\u00193+L_Gwo/F\u001f%r\u001a|[\n7BN?2c!H\u0004%\u007fY-/\u0007(B\u0007K8O\u0007_(8t\u0010C[ybN\u0007\u001f\u001az\u0016U\u0002/@SzGwr6B\u0013\u0014t\rU\u000fl\u0011/h=w;BH?2c!H\u0004%\u007fR\t\u0011 7BN?2c!H\u0004%\u007fY-.\u0019_h")), method4127(method4126("C\u0006*\u0005Y\u0014WZy+hf?\u0003I+eKwr2H\u0018w;B\u0007Kw;B\u0007Vwm\u0007U\u001f2cLW\u0004$r\u0016N\u00049 hf?\u0003I+eKwr,H\u0019:z\u000e\u0007Kw;B\u0007Vwm\u0007U\u001f2cLI\u0004%v\u0003KP]Z6s9\u001eYB\u0007\u0002\u0014t\u000eH\u001e%;B\u0007Kw;_\u0007\u001d2i\u0016B\u0013yx\rK\u0004% hf?\u0003I+eKwr6B\u0013\u0014t\rU\u000fw;B\u0007Vwm\u0007U\u001f2cLS\u000e/x\rH\u00193@RzP]T7s;\u0002OB\u0007\u0004\u0007t\u0011\u0007Kw;B\u0007Kw;_\u0007\u00192h\u0017K\u001fyk\rT\u0002#r\rIP]T7s;\u0002OB\u0007\u0004\u0014t\u000eH\u001e%;B\u0007Kw;_\u0007\u00192h\u0017K\u001fyx\rK\u0004% hh>\u0003K7sKwt6B\u0013\u0014t\rU\u000fg;B\u0007Vwi\u0007T\u001e;oLS\u000e/x\rH\u00193@RzP]T7s;\u0002OB\u0007\u0004\u0003~\u001ad\u00048i\u0006\u0016Kw;_\u0007\u00192h\u0017K\u001fyo\u0007_\b8t\u0010C0fFY-$\u0002O2r?w;\ra\u00040X\rH\u00193;B\u0007Kj;\u0010B\u0018\"w\u0016\t\r8|\u0001H\u0004%\u007fY-;\u0016I#jKw;\u0004H\f\u0007z\u0010F\u0006$;B\u0007Kj;\u0012U\u00040i\u0003JE;t\u0001F\u0007\f+?\u001ca\u0007Z0f&w;BP\n#~\u0010w\u00076u\u0007\u0007Kw&BW\u00198|\u0010F\u0006yw\rD\n;@SzP]K#u*\u001a;B\u0007\u001b\u001az\u0016U\u0002/@VzKw;_\u0007\u0010wh\u0016F\u001f25\u000fF\u001f%r\u001a\t\u001b%t\bB\b#r\rIK* hw*\u0005Z/\u0007Kwv\u0014j\n#i\u000b_0cFB\u0007Vw`BT\u001f6o\u0007\t\u00066o\u0010N\u0013yv\rC\u000e;m\u000bB\u001cwfY-;\u0016I#jKw;\u0016B\u0013\u001az\u0016U\u0002/@VzKj;\u0019\u0007\u0018#z\u0016BE:z\u0016U\u0002/5\u0016B\u0013#n\u0010B0gFBZP]O'j;w;B\u0007\u001d>~\u0015w\u0004$7BQ\u00022l,H\u0019:z\u000e\u000bK1t\u0005a\n4o\rUGw\u007f\u0007W\u001f?7BD\u0004;t\u0017UGwu\u0006H\u001f; hc;c;B\u0007\u001d>~\u0015w\u0004$5\u001a\u000bK:m/F\u001f%r\u001a|[\n7BN;8hY-/\u0007/B\u0007K!r\u0007P;8hL^Gwv\u0014j\n#i\u000b_0fFN\u0007\u0002\u0007t\u0011\u001ca\u0013KV\u0007Kwm\u000bB\u001c\u0007t\u0011\t\u0011{;\u000fQ&6o\u0010N\u0013\f)?\u000bK>K\rTP]_2\u0013Kw;\u0014N\u000e K\rTE 7BJ\u001d\u001az\u0016U\u0002/@QzGwr2H\u0018l\u00111r)w;BA\u00040]\u0003D\u001f8iL_Gw6\u0014N\u000e K\rTE-7BA\u00040K\u0003U\n:hL_P]V7kKw;\u0004H\f\u0011z\u0001S\u0004%5\u001a\u000bK1t\u0005a\n4o\rUE/7B\u0017Eg+S\u001e^d*P\u0012P]_2\u0013Kw;\u0006B\u001b#sN\u0007\u001c6o\u0007U;;z\fBGwm\u000bB\u001c\u0007t\u0011\u001ca\u001aZ&\u0007Kw}\r@-6x\u0016H\u0019ybN\u0007F3~\u0012S\u0003{;\u0004H\f\u0007z\u0010F\u0006$5\u0018\u000bK1t\u0005w\n%z\u000fTE  ht>\u0015;B\u0007\r8|$F\b#t\u0010\t\u0011{;OQ\u00022l2H\u0018yaN\u0007\r8|2F\u00196v\u0011\t\u0012l\u0011/r'w;BA\u00040]\u0003D\u001f8iL]Gw}\r@-6x\u0016H\u0019yaN\u0007[y+R\u0014Rg-P\u0012P]V+iKw;\u0004H\f\u0011z\u0001S\u0004%7BA\u00040]\u0003D\u001f8iN\u0007Zl\u0011/f3w;BA\u00040]\u0003D\u001f8iN\u0007\r8|$F\b#t\u0010\u000bKg hj>\u001b;B\u0007\r8|$F\b#t\u0010\t\u0011{;\u0004H\f\u0011z\u0001S\u0004%5\u0018\u000bKz\u007f\u0007W\u001f? hj*\u0013;B\u0007\u001d>~\u0015w\u0004$5\u001a^\u0011{;\u0015F\u001f2i2K\n9~L_\u0012-lN\u0007\r8|$F\b#t\u0010\t\u0011-a\u0018\u000bK!r\u0007P;8hL_\u0012-lY-&\u0016CB\u0007K8O\u0007_(8t\u0010CZyc\u001b]Gw}\r@-6x\u0016H\u0019yc\u001a_\u0013{;\u0004H\f\u0011z\u0001S\u0004%5\u001b^\u0012. hj$\u0001;B\u0007\u0004\u0003~\u001ad\u00048i\u0006\u0016E 7B\u0016P]_2\u0014Kw;\u0014N\u000e U\rU\u00066wL_Gwv\u0014j\n#i\u000b_0gFN\u0007\u0002\u0019t\u0010J\n; hc;d;B\u0007\u001d>~\u0015i\u0004%v\u0003KE.7BJ\u001d\u001az\u0016U\u0002/@SzGwr,H\u0019:z\u000e\u001ca\u0013KQ\u0007Kwm\u000bB\u001c\u0019t\u0010J\n;5\u0018\u000bK:m/F\u001f%r\u001a|Y\n7BN%8i\u000fF\u0007l\u0011&wXw;BI\u000f8o\u000e\t\u0013{;\u0014N\u000e U\rU\u00066wN\u0007\u0018#z\u0016BE;r\u0005O\u001f\f+?\t\u001b8h\u000bS\u00028uY-/\u0007(B\u0007K9\u007f\rS\u0007ybN\u0007\u001d>~\u0015i\u0004%v\u0003KGwh\u0016F\u001f25\u000eN\f?o9\u00166yk\rT\u0002#r\rIP]V#\u007fKw;\fC\u0004#wN\u0007\u00053t\u0016KGw+Y-&\u0018MB\u0007K4t\u000eH\u001e%7BT\u001f6o\u0007\t\u0007>|\nS\u00068\u007f\u0007KE6v\u0000N\u000e9oY-&\u0016_B\u0007K4t\u000eH\u001e%7BT\u001f6o\u0007\t\u0007>|\nS0gFLC\u00021}\u0017T\u000e{;\fC\u0004#wL_\u0013/cN\u0007\b8w\rR\u0019l\u0011/f/w;BD\u0004;t\u0017UGwh\u0016F\u001f25\u000eN\f?o9\u00166y\u007f\u000bA\r\"h\u0007\u000bK9\u007f\rS\u0007yb\u001b^\u0012{;\u0001H\u00078n\u0010\u001ca\u001aN.\u0007Kwt!H\u00078n\u0010\u000bK>X\rK\u0004\"iN\u0007\b8w\rR\u0019l\u0011&w_w;BH;8hL_Gwk/F\u001f%r\u001a|[\n7BQ\u00022l2H\u0018l\u0011&w_w;BH;8hL^Gwk/F\u001f%r\u001a|Z\n7BQ\u00022l2H\u0018l\u0011&w_w;BH;8hL]Gwk/F\u001f%r\u001a|Y\n7BQ\u00022l2H\u0018l\u0011&w_w;BH;8hLPGwk/F\u001f%r\u001a|X\n7BQ\u00022l2H\u0018l\u0011/h=w;BH-8|!H\u0004%\u007fL_Gwm\u000bB\u001c\u0007t\u0011\t\u0011l\u0011&w_w;BH?2c!H\u0004%\u007fR\t\u0013{;\u0016B\u0013\u001az\u0016U\u0002/@RzGwr6B\u0013\u0014t\rU\u000fl\u0011&w_w;BH?2c!H\u0004%\u007fR\t\u0012{;\u0016B\u0013\u001az\u0016U\u0002/@SzGwr6B\u0013\u0014t\rU\u000fl\u0011&w_w;BH?2c!H\u0004%\u007fR\t\u0011{;\u0016B\u0013\u001az\u0016U\u0002/@PzGwr6B\u0013\u0014t\rU\u000fl\u0011/h=w;BH?2c!H\u0004%\u007fR\t\u001c{;S\u001ca\u0012U&-")), method4127(method4126("\u0016WE\u00123")), method4127(method4126("\u0016WE\u00143")) };

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "Lhl;")
    public static class556 field8139 = new class556(74, 4);

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public static int field8156 = -1;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Z")
    private boolean field8148;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Z")
    private boolean field8152;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method831(boolean arg0) {
        try {
            if (arg0) {
                this.field8149 = null;
            }
            ++field8158;
            return this.field8150;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8160[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZ)V", line = 16)
    public final void method837(byte arg0, boolean arg1) {
        try {
            ++field8155;
            if (arg0 > -64) {
                method4124((byte) 70, (class63) null);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8160[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 26)
    public static void method4122(int arg0) {
        try {
            if (arg0 > 112) {
                field8139 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8160[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lvf;)V", line = 36)
    public class561(class159 arg0) {
        super(arg0);
        try {
            if (super.field5595.field2463) {
                this.field8151 = class32.method334(34336, super.field5595, true, field8160[11]);
                this.field8147 = class32.method334(34336, super.field5595, true, field8160[13]);
                this.field8149 = class32.method334(34336, super.field5595, true, field8160[10]);
                this.field8145 = class32.method334(34336, super.field5595, true, field8160[14]);
                if (!(this.field8151 != null & this.field8147 != null & this.field8149 != null & this.field8145 != null)) {
                    this.field8150 = false;
                } else {
                    this.field8144 = new class649(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                    this.field8144.method4732(false, 126, false);
                    this.field8150 = true;
                }
            } else {
                this.field8150 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8160[12] + (arg0 != null ? field8160[5] : field8160[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V", line = 64)
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 16) {
                method4122(-34);
            }
            ++field8146;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8160[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V", line = 76)
    public final void method4123(byte arg0) {
        try {
            ++field8141;
            class680 var2 = super.field5595.field2425;
            if (arg0 < -94) {
                if (this.field8152) {
                    OpenGL.glBindProgramARB(34336, ~super.field5595.field2465 == Integer.MIN_VALUE ? this.field8147.field8319 : this.field8145.field8319);
                } else {
                    OpenGL.glBindProgramARB(34336, ~super.field5595.field2465 != Integer.MIN_VALUE ? this.field8149.field8319 : this.field8151.field8319);
                }
                var2.method4953(-1.0F, 2, (float) super.field5595.field2465, class279.field4566, 0.0F, 0.0F);
                OpenGL.glProgramLocalParameter4fARB(34336, 1, class279.field4566[0], class279.field4566[1], class279.field4566[2], class279.field4566[3]);
                OpenGL.glEnable(34336);
                this.field8148 = true;
                this.method4125(6378);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8160[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lgb;II)V", line = 102)
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            if (arg0 == null) {
                if (!this.field8140) {
                    super.field5595.method1497(super.field5595.field2462, true);
                    super.field5595.method1425((byte) 35, 1);
                    super.field5595.method1456((byte) -101, 768, 34168, 0);
                    super.field5595.method1427(2, 34168, 770, 0);
                    this.field8140 = true;
                }
            } else {
                if (this.field8140) {
                    super.field5595.method1456((byte) -101, 768, 5890, 0);
                    super.field5595.method1427(2, 5890, 770, 0);
                    this.field8140 = false;
                }
                super.field5595.method1497(arg0, true);
                super.field5595.method1425((byte) 35, arg1);
            }
            if (arg2 != 16) {
                this.field8149 = null;
            }
            ++field8153;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8160[15] + (arg0 != null ? field8160[5] : field8160[6]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V", line = 140)
    public final void method834(int arg0, boolean arg1) {
        try {
            this.field8152 = arg1;
            ++field8142;
            if (arg0 != 16) {
                this.field8148 = true;
            }
            super.field5595.method1432((byte) 3, 1);
            super.field5595.method1497(this.field8144, true);
            super.field5595.method1492(7681, 34165, (byte) 17);
            super.field5595.method1456((byte) -101, 768, 34166, 0);
            super.field5595.method1456((byte) -101, 770, 5890, 2);
            super.field5595.method1427(arg0 + -14, 34168, 770, 0);
            super.field5595.method1432((byte) 3, 0);
            this.method4123((byte) -114);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8160[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 165)
    public final void method833(int arg0) {
        try {
            ++field8157;
            if (this.field8148) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field8148 = false;
            }
            super.field5595.method1432((byte) 3, 1);
            if (arg0 <= 38) {
                this.method831(false);
            }
            super.field5595.method1497((class224) null, true);
            super.field5595.method1492(8448, 8448, (byte) 17);
            super.field5595.method1456((byte) -101, 768, 5890, 0);
            super.field5595.method1456((byte) -101, 770, 34166, 2);
            super.field5595.method1427(2, 5890, 770, 0);
            super.field5595.method1432((byte) 3, 0);
            if (this.field8140) {
                super.field5595.method1456((byte) -101, 768, 5890, 0);
                super.field5595.method1427(2, 5890, 770, 0);
                this.field8140 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8160[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLha;)V", line = 200)
    public static final void method4124(byte arg0, class63 arg1) {
        try {
            if (arg0 != 66) {
                method4122(7);
            }
            ++field8154;
            if (~class336.field5471.method3222(false) != -1) {
                if (class623.field8996.field6379.method4132(true) == 0) {
                    for (class632 var2 = (class632) class336.field5471.method3228(arg0 + -55); var2 != null; var2 = (class632) class336.field5471.method3216(true)) {
                        class229.field3563.method526(true, var2.field9079, false, var2.field9081, false, class355.field5718, arg1, var2.field9080, var2.field9075 ? class438.field6846.field10798 : null, arg1, var2.field9083, var2.field9077);
                        var2.method4173(-1);
                    }
                    class30.method318(-107);
                } else {
                    if (class543.field7992 == null) {
                        Canvas var3 = new Canvas();
                        var3.setSize(36, 32);
                        class543.field7992 = class114.method1098(var3, class177.field2861, 0, 0, class259.field3910, 0);
                        class382.field6141 = class543.field7992.method184(class588.method4319(0, class242.field3745, 0, class45.field506), class174.method1613(class550.field8065, class45.field506, 0), true);
                    }
                    for (class632 var4 = (class632) class336.field5471.method3228(arg0 + -55); var4 != null; var4 = (class632) class336.field5471.method3216(true)) {
                        class229.field3563.method526(true, var4.field9079, false, var4.field9081, false, class382.field6141, class543.field7992, var4.field9080, !var4.field9075 ? null : class438.field6846.field10798, arg1, var4.field9083, var4.field9077);
                        var4.method4173(arg0 + -67);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8160[7] + arg0 + ',' + (arg1 != null ? field8160[5] : field8160[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V", line = 260)
    public final void method4125(int arg0) {
        try {
            ++field8143;
            if (arg0 == 6378) {
                if (this.field8148) {
                    int var2 = super.field5595.method193();
                    int var3 = super.field5595.method155();
                    float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
                    float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                    OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5595.field2439, (float) super.field5595.field2451 / 255.0F);
                    super.field5595.method1432((byte) 3, 1);
                    super.field5595.method1458(7, super.field5595.field2441);
                    super.field5595.method1432((byte) 3, 0);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8160[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4126(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4127(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
