import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class63 extends class96 {

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Z")
    private boolean field956 = false;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
    private boolean field967;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Lv;")
    private class572 field953;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Lv;")
    private class572 field958;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lv;")
    private class572 field951;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Lv;")
    private class572 field961;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Lbp;")
    private class117 field959;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field972 = new String[] { method685(method684("R\u0004II2")), method685(method684("W\u0006")), method685(method684("R\u0004IJ2")), method685(method684("R\u0004IL2")), method685(method684("OMI*g")), method685(method684("Z\u0016\u000bh")), method685(method684("R\u0004I@2")), method685(method684("R\u0004IA2")), method685(method684("R\u0004IK2")), method685(method684("R\u0004IH2")), method685(method684("R\u0004IG2")), method685(method684("R\u0004IF2")), method685(method684("\u0015B&VXB\u0013V**>\"3PH}!G$sd\f\u0014$:\u0014CG$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0013\bws@\n\bj!>\"3PH}!G$sz\f\u0015i{XCG$:\u0014CZ$lQ\u0011\u0013ab\u001a\r\bvwU\u000f\\\u000e[`75MX\u0014C\u000eGuX\f\u0012v:\u0014CG$:\tC\u0011ah@\u0006\u001f*y[\u000f\bv!>\"3PH}!G$s`\u0006\u001fGu[\u0011\u0003$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0017\u0002|y[\f\u0015`A\u0004>\\\u000eUa77QN\u0014C\bTuGCG$:\u0014CG$:\tC\u0015aiA\u000f\u0013*j[\u0010\u000eps[\r\\\u000eUa77QN\u0014C\bGuX\f\u0012v:\u0014CG$:\tC\u0015aiA\u000f\u0013*y[\u000f\bv!>,2PJa7G$u`\u0006\u001fGu[\u0011\u00034:\u0014CZ$hQ\u0010\u0012hn\u001a\u0017\u0002|y[\f\u0015`A\u0004>\\\u000eUa77QN\u0014C\bP\u007fL \bkhPRG$:\tC\u0015aiA\u000f\u0013*nQ\u001b\u0004kuF\u0007<5G\u000fi(QNd63$:[%\bcY[\f\u0015`:\u0014CG9:F\u0006\u0014qv@M\u0001k}W\f\bv~\u000fi7EHu.G$:R\f\u0000T{F\u0002\nw:\u0014CG9:D\u0011\bchU\u000eIhuW\u0002\u000b_*iXmT[f\"*$:\u0014\u0014\u0006p\u007fF3\u000betQCG$'\u0014\u0013\u0015k}F\u0002\n*v[\u0000\u0006hA\u0005>\\\u000eJu1&I:\u0014C\u0017I{@\u0011\u000e|A\u0000>G$:\tC\u001c$i@\u0002\u0013a4Y\u0002\u0013vsLM\u0017vu^\u0006\u0004ps[\rGy!>3&V[yCG$wB.\u0006ph]\u001b<0G\u0014CZ$a\u0014\u0010\u0013enQM\nenF\n\u001f*w[\u0007\u0002hl]\u0006\u0010$g\u000fi7EHu.G$:@\u0006\u001fI{@\u0011\u000e|A\u0000>G9:OC\u0014p{@\u0006Ii{@\u0011\u000e|4@\u0006\u001fpoF\u0006<4G\u0014\u001e\\\u000eNq.7$:\u0014C\u0011m\u007fC3\bw6\u0014\u0015\u000eamz\f\u0015i{XOGbuS%\u0006gn[\u0011K$~Q\u0013\u0013l6\u0014\u0000\bhuA\u0011K$tP\f\u0013h!>'70:\u0014C\u0011m\u007fC3\bw4LOGily\u0002\u0013vsL8WY6\u0014\n7ki\u000fi#T.\u0014CGrsQ\u00147ki\u001a\u001aK$wB.\u0006ph]\u001b<5G\u0018C\u000eTuGXm@J\u0000CG$l]\u0006\u0010TuGM\u001d(:Y\u0015*enF\n\u001f_(iOGmJ[\u0010\\\u000e^dWG$:B\n\u0002sJ[\u0010Is6\u0014\u000e\u0011I{@\u0011\u000e|A\u0007>K$sd\f\u0014?\u0010g6%$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u001bK$7B\n\u0002sJ[\u0010I~6\u0014\u0005\bcJU\u0011\u0006ii\u001a\u001b\\\u000eWa/G$:R\f\u0000B{W\u0017\bv4LOGbuS%\u0006gn[\u0011I|6\u0014SI4*\u0005ZR7+\u0006V\\\u000e^dWG$:P\u0006\u0017pr\u0018C\u0010enQ\u00117h{Z\u0006K$l]\u0006\u0010TuGXmI[pCG$|[\u0004!ey@\f\u0015*c\u0018CJ`\u007fD\u0017\u000f(:R\f\u0000T{F\u0002\nw4NOGbuS3\u0006v{Y\u0010Is!>02F:\u0014C\u0001k}r\u0002\u0004puFM\u001d(:\u0019\u0015\u000eamd\f\u0014*`\u0018C\u0001k}d\u0002\u0015ewGM\u001e?\u0010y6+$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019K$|[\u0004!ey@\f\u0015*`\u0018CW**\u0004P^4,\u0006V\\\u000eW}-G$:R\f\u0000B{W\u0017\bv6\u0014\u0005\bc\\U\u0000\u0013kh\u0018CV?\u0010y\"?$:\u0014\u0005\bc\\U\u0000\u0013kh\u0018C\u0001k}r\u0002\u0004puFOG4!>.2H:\u0014C\u0001k}r\u0002\u0004puFM\u001d(:R\f\u0000B{W\u0017\bv4NOG)~Q\u0013\u0013l!>.&@:\u0014C\u0011m\u007fC3\bw4L\u001a\u001d(:C\u0002\u0013ahd\u000f\u0006j\u007f\u001a\u001b\u001e~m\u0018C\u0001k}r\u0002\u0004puFM\u001d~`NOGrsQ\u00147ki\u001a\u001b\u001e~m\u000fi*EB\u0014CGkNQ\u001b$kuF\u0007V*bM\u0019K$|[\u0004!ey@\f\u0015*bL\u001b\u001f(:R\f\u0000B{W\u0017\bv4M\u001a\u001e}!>.(R:\u0014C\bP\u007fL \bkhPRIs6\u0014R\\\u000e^dPG$:B\n\u0002sT[\u0011\nev\u001a\u001bK$wB.\u0006ph]\u001b<4G\u0018C\u000eJuF\u000e\u0006h!>'77:\u0014C\u0011m\u007fC-\bvwU\u000fI}6\u0014\u000e\u0011I{@\u0011\u000e|A\u0005>K$sz\f\u0015i{XXm@J\u0007CG$l]\u0006\u0010JuF\u000e\u0006h4NOGily\u0002\u0013vsL8UY6\u0014\n)khY\u0002\u000b?\u0010p3T$:\u0014\r\u0003knXM\u001f(:B\n\u0002sT[\u0011\nev\u0018C\u0014p{@\u0006IhsS\u000b\u0013_*iM\u0017ki]\u0017\u000ekt\u000fi#T)\u0014CGj~[\u0017\u000b*c\u0018C\u0011m\u007fC-\bvwU\u000fK$i@\u0002\u0013a4X\n\u0000lnoR:*j[\u0010\u000eps[\r\\\u000eWu;G$:Z\u0007\bpv\u0018C\t`u@\u000fK$*\u000fi*KL\u0014CGguX\f\u0012v6\u0014\u0010\u0013enQM\u000bm}\\\u0017\nk~Q\u000fIewV\n\u0002jn\u000fi*E^\u0014CGguX\f\u0012v6\u0014\u0010\u0013enQM\u000bm}\\\u0017<4G\u001a\u0007\u000eb|A\u0010\u0002(:Z\u0007\bpv\u001a\u001b\u001f|b\u0018C\u0004kv[\u0016\u0015?\u0010y\"#$:\u0014\u0000\bhuA\u0011K$i@\u0002\u0013a4X\n\u0000lnoR:*~]\u0005\u0001qiQOGj~[\u0017\u000b*cM\u001a\u001e(:W\f\u000bkoFXmIOxCG$uw\f\u000bkoFOGmY[\u000f\bqh\u0018C\u0004kv[\u0016\u0015?\u0010p3S$:\u0014\f7ki\u001a\u001bK$jy\u0002\u0013vsL8WY6\u0014\u0015\u000eamd\f\u0014?\u0010p3S$:\u0014\f7ki\u001a\u001aK$jy\u0002\u0013vsL8VY6\u0014\u0015\u000eamd\f\u0014?\u0010p3S$:\u0014\f7ki\u001a\u0019K$jy\u0002\u0013vsL8UY6\u0014\u0015\u000eamd\f\u0014?\u0010p3S$:\u0014\f7ki\u001a\u0014K$jy\u0002\u0013vsL8TY6\u0014\u0015\u000eamd\f\u0014?\u0010y,1$:\u0014\f!k}w\f\bv~\u001a\u001bK$l]\u0006\u0010TuGM\u001d?\u0010p3S$:\u0014\f3abw\f\bv~\u0004M\u001f(:@\u0006\u001fI{@\u0011\u000e|A\u0004>K$s`\u0006\u001fGu[\u0011\u0003?\u0010p3S$:\u0014\f3abw\f\bv~\u0004M\u001e(:@\u0006\u001fI{@\u0011\u000e|A\u0005>K$s`\u0006\u001fGu[\u0011\u0003?\u0010p3S$:\u0014\f3abw\f\bv~\u0004M\u001d(:@\u0006\u001fI{@\u0011\u000e|A\u0006>K$s`\u0006\u001fGu[\u0011\u0003?\u0010y,1$:\u0014\f3abw\f\bv~\u0004M\u0010(:\u0005XmATpi")), method685(method684("\u0015B&VXB\u0013V**>\"3PH}!G$sd\f\u0014$:\u0014CG$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0013\bws@\n\bj!>\"3PH}!G$sz\f\u0015i{XCG$:\u0014CZ$lQ\u0011\u0013ab\u001a\r\bvwU\u000f\\\u000e[`75MX\u0014C\u000eGuX\f\u0012v:\u0014CG$:\tC\u0011ah@\u0006\u001f*y[\u000f\bv!>\"3PH}!G$s`\u0006\u001fGu[\u0011\u0003$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0017\u0002|y[\f\u0015`A\u0004>\\\u000eUa77QN\u0014C\bTuGCG$:\u0014CG$:\tC\u0015aiA\u000f\u0013*j[\u0010\u000eps[\r\\\u000eUa77QN\u0014C\bGuX\f\u0012v:\u0014CG$:\tC\u0015aiA\u000f\u0013*y[\u000f\bv!>,2PJa7G$u`\u0006\u001fGu[\u0011\u00034:\u0014CZ$hQ\u0010\u0012hn\u001a\u0017\u0002|y[\f\u0015`A\u0004>\\\u000eUa77QN\u0014C\bP\u007fL \bkhPRG$:\tC\u0015aiA\u000f\u0013*nQ\u001b\u0004kuF\u0007<5G\u000fi(QNd63$:[%\bcY[\f\u0015`:\u0014CG9:F\u0006\u0014qv@M\u0001k}W\f\bv~\u000fi7EHu.G$:R\f\u0000T{F\u0002\nw:\u0014CG9:D\u0011\bchU\u000eIhuW\u0002\u000b_*iXmT[f\"*$:\u0014\u0014\u0006p\u007fF3\u000betQCG$'\u0014\u0013\u0015k}F\u0002\n*v[\u0000\u0006hA\u0005>\\\u000eJu1&I:\u0014C\u0013I{@\u0011\u000e|A\u0000>G$:\tC\u001c$i@\u0002\u0013a4Y\u0002\u0013vsLM\u0013ab@\u0016\u0015aA\u0004>Gy!>3&V[yCG$jy\u0002\u0013vsL8SY:\u0014CZ$a\u0014\u0010\u0013enQM\nenF\n\u001f*jF\f\ray@\n\bj:IXmT[f\"*$:\u0014\u000e\u0011I{@\u0011\u000e|A\u0000>G$'\u0014\u0018GwnU\u0017\u0002*wU\u0017\u0015mb\u001a\u000e\b`\u007fX\u0015\u000eam\u0014\u001e\\\u000eNq.7$:\u0014C\u0011m\u007fC3\bw6\u0014\u0015\u000eamz\f\u0015i{XOGbuS%\u0006gn[\u0011K$y[\u000f\bqh\u0018C\t`u@\u000f\\\u000e^dWG$:B\n\u0002sJ[\u0010I|6\u0014\u000e\u0011I{@\u0011\u000e|A\u0004>K$sd\f\u0014?\u0010p3S$:\u0014\u0015\u000eamd\f\u0014*c\u0018C\nrWU\u0017\u0015mboR:(:]3\bw!>'70:\u0014C\u0011m\u007fC3\bw4NOGily\u0002\u0013vsL8UY6\u0014\n7ki\u000fi#T.\u0014CGrsQ\u00147ki\u001a\u0014K$wB.\u0006ph]\u001b<7G\u0018C\u000eTuGXmWOvCG$|[\u0004!ey@\f\u0015*b\u0018CJrsQ\u00147ki\u001a\u0019K$|[\u00047ehU\u000e\u0014*b\u000fi*QV\u0014CGbuS%\u0006gn[\u0011I|6\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u001bK$*\u001aSW5#\u0001PV6/\u000fi*E^\u0014CGbuS%\u0006gn[\u0011I}6\u0014\n3abw\f\bv~\u001a\u0019K$|[\u00047ehU\u000e\u0014*`\u0018C\u0001k}d\u0002\u0015ewGM\u0010?\u0010g6%$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019K$7B\n\u0002sJ[\u0010I~6\u0014\u0005\bcJU\u0011\u0006ii\u001a\u001a\\\u000eWa/G$:R\f\u0000B{W\u0017\bv4NOGbuS%\u0006gn[\u0011I~6\u0014SI4*\u0007ZW2(\u0001XmIOxCG$|[\u0004!ey@\f\u0015*b\u0018C\u0001k}r\u0002\u0004puFM\u001f(:R\f\u0000B{W\u0017\bv4MXmISzCG$|[\u0004!ey@\f\u0015(:R\f\u0000B{W\u0017\bv6\u0014R\\\u000eWu;G$:R\f\u0000B{W\u0017\bv6\u0014\u0005\bc\\U\u0000\u0013kh\u0018CW?\u0010y6+$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019K$|[\u0004!ey@\f\u0015*`\u0018C\u000eP\u007fL \bkhPM\u001d?\u0010y\"#$:\u0014\u0015\u000eamd\f\u0014*bM\u0019K$mU\u0017\u0002vJX\u0002\ta4L\u001a\u001ds6\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019\u001d~`\u0018C\u0011m\u007fC3\bw4L\u001a\u001ds!>.&\\:\u0014C\bP\u007fL \bkhPRI|cNOGbuS%\u0006gn[\u0011I|bL\u001bK$|[\u0004!ey@\f\u0015*cM\u001a\u001e?\u0010y,1$:\u0014\f3abw\f\bv~\u0005M\u0010(:\u0005Xm@J\u0007CG$l]\u0006\u0010JuF\u000e\u0006h4LOGily\u0002\u0013vsL8WY6\u0014\n)khY\u0002\u000b?\u0010p3T$:\u0014\u0015\u000eamz\f\u0015i{XM\u001e(:Y\u0015*enF\n\u001f_+iOGmT[\u0011\nev\u000fi#T)\u0014CGrsQ\u0014)khY\u0002\u000b*`\u0018C\nrWU\u0017\u0015mboQ:(:]-\bvwU\u000f\\\u000e^dPG$:Z\u0007\bpv\u001a\u001bK$l]\u0006\u0010JuF\u000e\u0006h6\u0014\u0010\u0013enQM\u000bm}\\\u0017<4G\u001a\u0013\bws@\n\bj!>'77:\u0014C\t`u@\u000fI}6\u0014\u0015\u000eamz\f\u0015i{XOGwnU\u0017\u0002*v]\u0004\u000fpA\u0005>ItuG\n\u0013muZXmI[lCG$tP\f\u0013h6\u0014\r\u0003knXOG4!>.(R:\u0014C\u0004kv[\u0016\u0015(:G\u0017\u0006p\u007f\u001a\u000f\u000ecr@\u000e\b`\u007fXM\u0006ix]\u0006\tp!>.&@:\u0014C\u0004kv[\u0016\u0015(:G\u0017\u0006p\u007f\u001a\u000f\u000ecr@8WY4P\n\u0001boG\u0006K$tP\f\u0013h4L\u001b\u001f|6\u0014\u0000\bhuA\u0011\\\u000eWu'G$:W\f\u000bkoFOGwnU\u0017\u0002*v]\u0004\u000fpA\u0005>I`sR\u0005\u0012w\u007f\u0018C\t`u@\u000fI}cM\u001aK$y[\u000f\bqh\u000fi*QV\u0014CGkY[\u000f\bqh\u0018C\u000eGuX\f\u0012v6\u0014\u0000\bhuA\u0011\\\u000e^dWG$:[3\bw4LOGtWU\u0017\u0015mboS:(:B\n\u0002sJ[\u0010\\\u000e^dWG$:[3\bw4MOGtWU\u0017\u0015mboR:(:B\n\u0002sJ[\u0010\\\u000e^dWG$:[3\bw4NOGtWU\u0017\u0015mboQ:(:B\n\u0002sJ[\u0010\\\u000e^dWG$:[3\bw4COGtWU\u0017\u0015mboP:(:B\n\u0002sJ[\u0010\\\u000eW{5G$:[%\bcY[\f\u0015`4LOGrsQ\u00147ki\u001a\u0019\\\u000e^dPG$:[7\u0002|Y[\f\u0015`*\u001a\u001bK$ny\u0002\u0013vsL8WY6\u0014\n3abw\f\bv~\u000fi#T)\u0014CGkNQ\u001b$kuF\u0007W*c\u0018C\u0013I{@\u0011\u000e|A\u0005>K$s`\u0006\u001fGu[\u0011\u0003?\u0010y,1$:\u0014\f3abw\f\bv~\u0004M\u001ds6\u0014\n3abw\f\bv~\u000fi\"J^>")), method685(method684("R\u0004I8sZ\n\u0013:2")), method685(method684("\u0015B&VXB\u0013V**>\"3PH}!G$sd\f\u0014$:\u0014CG$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0013\bws@\n\bj!>\"3PH}!G$sw\f\u000bkoFCG$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0000\bhuFXmEN`1.F:\u0014\n3abw\f\bv~\u0014CG$'\u0014\u0015\u0002vnQ\u001bIp\u007fL\u0000\bkhP8WY!>,2PJa7G$ud\f\u0014$:\u0014CG$:\u0014CZ$hQ\u0010\u0012hn\u001a\u0013\bws@\n\bj!>,2PJa7G$uw\f\u000bkoFCG$:\u0014CZ$hQ\u0010\u0012hn\u001a\u0000\bhuFXmKO`32P:\u0014\f3abw\f\bv~\u0004CG$'\u0014\u0011\u0002woX\u0017Ip\u007fL\u0000\bkhP8WY!>,2PJa7G$u`\u0006\u001fGu[\u0011\u00035:\u0014CZ$hQ\u0010\u0012hn\u001a\u0017\u0002|y[\f\u0015`A\u0005>\\\u000eUa77QN\u0014C\bBuS \bkhPCG$:\tC\u0015aiA\u000f\u0013*|[\u0004\u0004kuF\u0007\\\u000eJu1&I:\u0014C\u0001k}d\u0002\u0015ewGCG$:\tC\u0017vuS\u0011\u0006i4X\f\u0004evoS:?\u0010d\"5EW\u0014CGs{@\u0006\u0015TvU\r\u0002$:\u0014^Gth[\u0004\u0015ew\u001a\u000f\bg{X8VY!>3&V[yCG$ny\u0002\u0013vsL8SY:\u0014CZ$a\u0014\u0010\u0013enQM\nenF\n\u001f*nQ\u001b\u0013qhQ8WY:IXmT[f\"*$:\u0014\u0013*enF\n\u001f_.iCG$'\u0014\u0018GwnU\u0017\u0002*wU\u0017\u0015mb\u001a\u0013\u0015kpQ\u0000\u0013muZC\u001a?\u0010d\"5EW\u0014CGily\u0002\u0013vsL8SY:\u0014^G\u007f:G\u0017\u0006p\u007f\u001a\u000e\u0006ph]\u001bIiuP\u0006\u000brsQ\u0014Gy!>7\"IJ\u0014CG$l]\u0006\u0010TuGOGbuS%\u0006gn[\u0011\\\u000e^dWG$:B\n\u0002sJ[\u0010I|6\u0014\u000e\u0011I{@\u0011\u000e|A\u0004>K$sd\f\u0014?\u0010p3S$:\u0014\u0015\u000eamd\f\u0014*c\u0018C\nrWU\u0017\u0015mboR:(:]3\bw!>'70:\u0014C\u0011m\u007fC3\bw4NOGily\u0002\u0013vsL8UY6\u0014\n7ki\u000fi#T.\u0014CGrsQ\u00147ki\u001a\u0014K$wB.\u0006ph]\u001b<7G\u0018C\u000eTuGXmWOvCG$|[\u0004!ey@\f\u0015*b\u0018CJrsQ\u00147ki\u001a\u0019K$|[\u00047ehU\u000e\u0014*b\u000fi*QV\u0014CGbuS%\u0006gn[\u0011I|6\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u001bK$*\u001aSW5#\u0001PV6/\u000fi*E^\u0014CGbuS%\u0006gn[\u0011I}6\u0014\n3abw\f\bv~\u001a\u0019K$|[\u00047ehU\u000e\u0014*`\u0018C\u0001k}d\u0002\u0015ewGM\u0010?\u0010g6%$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019K$7B\n\u0002sJ[\u0010I~6\u0014\u0005\bcJU\u0011\u0006ii\u001a\u001a\\\u000eWa/G$:R\f\u0000B{W\u0017\bv4NOGbuS%\u0006gn[\u0011I~6\u0014SI4*\u0007ZW2(\u0001XmIOxCG$|[\u0004!ey@\f\u0015*b\u0018C\u0001k}r\u0002\u0004puFM\u001f(:R\f\u0000B{W\u0017\bv4MXmISzCG$|[\u0004!ey@\f\u0015(:R\f\u0000B{W\u0017\bv6\u0014R\\\u000eWu;G$:R\f\u0000B{W\u0017\bv6\u0014\u0005\bc\\U\u0000\u0013kh\u0018CW?\u0010y6+$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019K$|[\u0004!ey@\f\u0015*`\u0018C\u000eP\u007fL \bkhPM\u001d?\u0010y\"#$:\u0014\u0015\u000eamd\f\u0014*bM\u0019K$mU\u0017\u0002vJX\u0002\ta4L\u001a\u001ds6\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019\u001d~`\u0018C\u0011m\u007fC3\bw4L\u001a\u001ds!>.&\\:\u0014C\bP\u007fL \bkhPRI|cNOGbuS%\u0006gn[\u0011I|bL\u001bK$|[\u0004!ey@\f\u0015*cM\u001a\u001e?\u0010y,1$:\u0014\f3abw\f\bv~\u0005M\u0010(:\u0005XmIUbCG$uw\f\u000bkoFOGmY[\u000f\bqh\u000fi#T.\u0014CGkJ[\u0010I|6\u0014\u0013*enF\n\u001f_*iOGrsQ\u00147ki\u000fi#T.\u0014CGkJ[\u0010I}6\u0014\u0013*enF\n\u001f_+iOGrsQ\u00147ki\u000fi#T.\u0014CGkJ[\u0010I~6\u0014\u0013*enF\n\u001f_(iOGrsQ\u00147ki\u000fi#T.\u0014CGkJ[\u0010Is6\u0014\u0013*enF\n\u001f_)iOGrsQ\u00147ki\u000fi*KL\u0014CGk\\[\u0004$kuF\u0007I|6\u0014\u0015\u000eamd\f\u0014*`\u000fi#T)\u0014CGkNQ\u001b$kuF\u0007W*b\u0018C\u0013I{@\u0011\u000e|A\u0004>K$s`\u0006\u001fGu[\u0011\u0003?\u0010p3T$:\u0014\f3abw\f\bv~\u0004M\u001e(:@.\u0006ph]\u001b<5G\u0018C\u000eP\u007fL \bkhPXmIUbCG$u`\u0006\u001fGu[\u0011\u000344N\u0014K$s`\u0006\u001fGu[\u0011\u0003?\u0010q-#\u000e")), method685(method684("\u0015B&VXB\u0013V**>\"3PH}!G$sd\f\u0014$:\u0014CG$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0013\bws@\n\bj!>\"3PH}!G$sw\f\u000bkoFCG$:\u0014CZ$lQ\u0011\u0013ab\u001a\u0000\bhuFXmEN`1.F:\u0014\n3abw\f\bv~\u0014CG$'\u0014\u0015\u0002vnQ\u001bIp\u007fL\u0000\bkhP8WY!>,2PJa7G$ud\f\u0014$:\u0014CG$:\u0014CZ$hQ\u0010\u0012hn\u001a\u0013\bws@\n\bj!>,2PJa7G$uw\f\u000bkoFCG$:\u0014CZ$hQ\u0010\u0012hn\u001a\u0000\bhuFXmKO`32P:\u0014\f3abw\f\bv~\u0004CG$'\u0014\u0011\u0002woX\u0017Ip\u007fL\u0000\bkhP8WY!>,2PJa7G$u`\u0006\u001fGu[\u0011\u00035:\u0014CZ$hQ\u0010\u0012hn\u001a\u0017\u0002|y[\f\u0015`A\u0005>\\\u000eUa77QN\u0014C\bBuS \bkhPCG$:\tC\u0015aiA\u000f\u0013*|[\u0004\u0004kuF\u0007\\\u000eJu1&I:\u0014C\u0001k}d\u0002\u0015ewGCG$:\tC\u0017vuS\u0011\u0006i4X\f\u0004evoS:?\u0010d\"5EW\u0014CGs{@\u0006\u0015TvU\r\u0002$:\u0014^Gth[\u0004\u0015ew\u001a\u000f\bg{X8VY!>3&V[yCG$jy\u0002\u0013vsL8SY:\u0014CZ$a\u0014\u0010\u0013enQM\nenF\n\u001f*jF\f\ray@\n\bj:IXmT[f\"*$:\u0014\u000e\u0011I{@\u0011\u000e|A\u0000>G$'\u0014\u0018GwnU\u0017\u0002*wU\u0017\u0015mb\u001a\u000e\b`\u007fX\u0015\u000eam\u0014\u001e\\\u000eJu1&I:\u0014C\u0013aby\u0002\u0013vsL8SY:\tC\u001c$i@\u0002\u0013a4Y\u0002\u0013vsLM\u0013ab@\u0016\u0015aA\u0004>Gy!>7\"IJ\u0014CG$l]\u0006\u0010TuGOGbuS%\u0006gn[\u0011K$~Q\u0013\u0013l!>'70:\u0014C\u0011m\u007fC3\bw4LOGily\u0002\u0013vsL8WY6\u0014\n7ki\u000fi#T.\u0014CGrsQ\u00147ki\u001a\u001aK$wB.\u0006ph]\u001b<5G\u0018C\u000eTuGXm@J\u0000CG$l]\u0006\u0010TuGM\u001d(:Y\u0015*enF\n\u001f_(iOGmJ[\u0010\\\u000e^dWG$:B\n\u0002sJ[\u0010Is6\u0014\u000e\u0011I{@\u0011\u000e|A\u0007>K$sd\f\u0014?\u0010g6%$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u001bK$7B\n\u0002sJ[\u0010I~6\u0014\u0005\bcJU\u0011\u0006ii\u001a\u001b\\\u000eWa/G$:R\f\u0000B{W\u0017\bv4LOGbuS%\u0006gn[\u0011I|6\u0014SI4*\u0005ZR7+\u0006V\\\u000e^dWG$:P\u0006\u0017pr\u0018C\u0010enQ\u00117h{Z\u0006K$l]\u0006\u0010TuGXmI[pCG$|[\u0004!ey@\f\u0015*c\u0018CJ`\u007fD\u0017\u000f(:R\f\u0000T{F\u0002\nw4NOGbuS3\u0006v{Y\u0010Is!>02F:\u0014C\u0001k}r\u0002\u0004puFM\u001d(:\u0019\u0015\u000eamd\f\u0014*`\u0018C\u0001k}d\u0002\u0015ewGM\u001e?\u0010y6+$:\u0014\u0005\bc\\U\u0000\u0013kh\u001a\u0019K$|[\u0004!ey@\f\u0015*`\u0018CW**\u0004P^4,\u0006V\\\u000eW}-G$:R\f\u0000B{W\u0017\bv6\u0014\u0005\bc\\U\u0000\u0013kh\u0018CV?\u0010y\"?$:\u0014\u0005\bc\\U\u0000\u0013kh\u0018C\u0001k}r\u0002\u0004puFOG4!>.2H:\u0014C\u0001k}r\u0002\u0004puFM\u001d(:R\f\u0000B{W\u0017\bv4NOG)~Q\u0013\u0013l!>.&@:\u0014C\u0011m\u007fC3\bw4L\u001a\u001d(:C\u0002\u0013ahd\u000f\u0006j\u007f\u001a\u001b\u001e~m\u0018C\u0001k}r\u0002\u0004puFM\u001d~`NOGrsQ\u00147ki\u001a\u001b\u001e~m\u000fi*EB\u0014CGkNQ\u001b$kuF\u0007V*bM\u0019K$|[\u0004!ey@\f\u0015*bL\u001b\u001f(:R\f\u0000B{W\u0017\bv4M\u001a\u001e}!>.(R:\u0014C\bP\u007fL \bkhPRIs6\u0014R\\\u000eW{5G$:[ \bhuA\u0011K$sw\f\u000bkoFXm@J\u0000CG$ud\f\u0014*b\u0018C\u0017I{@\u0011\u000e|A\u0004>K$l]\u0006\u0010TuGXm@J\u0000CG$ud\f\u0014*c\u0018C\u0017I{@\u0011\u000e|A\u0005>K$l]\u0006\u0010TuGXm@J\u0000CG$ud\f\u0014*`\u0018C\u0017I{@\u0011\u000e|A\u0006>K$l]\u0006\u0010TuGXm@J\u0000CG$ud\f\u0014*m\u0018C\u0017I{@\u0011\u000e|A\u0007>K$l]\u0006\u0010TuGXmIUbCG$ur\f\u0000Gu[\u0011\u0003*b\u0018C\u0011m\u007fC3\bw4NXm@J\u0000CG$u`\u0006\u001fGu[\u0011\u000344LOGp\u007fL.\u0006ph]\u001b<4G\u0018C\u000eP\u007fL \bkhPXm@J\u0000CG$u`\u0006\u001fGu[\u0011\u000344MOGp\u007fL.\u0006ph]\u001b<5G\u0018C\u000eP\u007fL \bkhPXm@J\u0000CG$u`\u0006\u001fGu[\u0011\u000344NOGp\u007fL.\u0006ph]\u001b<6G\u0018C\u000eP\u007fL \bkhPXmIUbCG$u`\u0006\u001fGu[\u0011\u000344COG5!>&)@\u0010")), method685(method684("R\u0004IB2")), method685(method684("R\u0004IC2")), method685(method684("R\u0004IE2")) };

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lsb;")
    public static class261 field968 = new class261(46, 3);

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "F")
    public static float field970;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Z")
    private boolean field957;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Z")
    private boolean field964;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)V", line = 3)
    public static final void method672(boolean arg0, int arg1) {
        try {
            ++field963;
            if (arg0 && class534.field7727 != null) {
                class172.field2279 = class534.field7727.field10181;
            } else {
                class172.field2279 = -1;
            }
            class534.field7727 = null;
            class304.field4238 = null;
            class511.field7506 = 0;
            class226.field3277 = null;
            class534.method4048();
            class534.field7732.method3982(-122);
            class129.field1607 = null;
            class553.field8060 = null;
            class365.field5292 = null;
            class610.field8737 = null;
            class573.field8301 = -1;
            class801.field11652 = -1;
            class755.field10798 = null;
            class534.field7737 = null;
            class750.field10678 = null;
            class403.field5871 = null;
            class248.field3560 = null;
            class211.field3081 = null;
            if (class534.field7725 != null) {
                class534.field7725.method2506((byte) 121);
                class534.field7725.method2503(64, true, 128);
            }
            if (class534.field7724 != null) {
                class534.field7724.method2203(64, true, 64);
            }
            if (class534.field7730 != null) {
                class534.field7730.method2834(30, 64);
            }
            class16.field203.method5242(arg1, false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field972[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V", line = 47)
    public final void method673(boolean arg0, int arg1) {
        try {
            this.field964 = arg0;
            ++field960;
            super.field1301.method1619(1, (byte) 125);
            int var3 = 47 / ((arg1 - 36) / 55);
            super.field1301.method1618((byte) -93, this.field959);
            super.field1301.method1628(7681, 34165, 34162);
            super.field1301.method1669(768, 0, 34166, (byte) -113);
            super.field1301.method1669(770, 2, 5890, (byte) -127);
            super.field1301.method1650(0, (byte) -109, 770, 34168);
            super.field1301.method1619(0, (byte) 125);
            this.method678(106);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field972[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 66)
    public static void method674(int arg0) {
        try {
            field968 = null;
            if (arg0 != 34820) {
                method682(-101, -99, false);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field972[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 81)
    public final void method675(int arg0) {
        try {
            if (this.field957) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field957 = false;
            }
            ++field955;
            super.field1301.method1619(1, (byte) 125);
            if (arg0 == -16265) {
                super.field1301.method1618((byte) -106, (class469) null);
                super.field1301.method1628(8448, 8448, arg0 + 50427);
                super.field1301.method1669(768, 0, 5890, (byte) -109);
                super.field1301.method1669(770, 2, 34166, (byte) -127);
                super.field1301.method1650(0, (byte) -109, 770, 5890);
                super.field1301.method1619(0, (byte) 125);
                if (this.field956) {
                    super.field1301.method1669(768, 0, 5890, (byte) -117);
                    super.field1301.method1650(0, (byte) -109, 770, 5890);
                    this.field956 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field972[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Lmh;", line = 115)
    public static final class320 method676(int arg0) {
        try {
            ++field949;
            try {
                int var1 = -31 % ((6 - arg0) / 61);
                return new class243();
            } catch (Throwable var4) {
                try {
                    return (class320) Class.forName(field972[1]).newInstance();
                } catch (Throwable var3) {
                    return new class540();
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field972[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lml;)V", line = 300)
    public class63(class194 arg0) {
        super(arg0);
        try {
            if (!super.field1301.field2873) {
                this.field967 = false;
            } else {
                this.field953 = class607.method4481(field972[15], -21236, super.field1301, 34336);
                this.field958 = class607.method4481(field972[13], -21236, super.field1301, 34336);
                this.field951 = class607.method4481(field972[16], -21236, super.field1301, 34336);
                this.field961 = class607.method4481(field972[12], -21236, super.field1301, 34336);
                if (this.field961 != null & this.field951 != null & this.field953 != null & this.field958 != null) {
                    this.field959 = new class117(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                    this.field959.method1065(false, (byte) 109, false);
                    this.field967 = true;
                } else {
                    this.field967 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field972[14] + (arg0 != null ? field972[4] : field972[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Z", line = 149)
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                this.field964 = true;
            }
            ++field969;
            return this.field967;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field972[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V", line = 160)
    public final void method678(int arg0) {
        try {
            ++field965;
            class70 var2 = super.field1301.field2794;
            if (this.field964) {
                OpenGL.glBindProgramARB(34336, super.field1301.field2870 == Integer.MAX_VALUE ? this.field958.field8285 : this.field961.field8285);
            } else {
                OpenGL.glBindProgramARB(34336, ~super.field1301.field2870 != Integer.MIN_VALUE ? this.field951.field8285 : this.field953.field8285);
            }
            var2.method725(-1.0F, 0.0F, class489.field7166, (float) super.field1301.field2870, 0.0F, -119);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class489.field7166[0], class489.field7166[1], class489.field7166[2], class489.field7166[3]);
            OpenGL.glEnable(34336);
            if (arg0 <= 90) {
                method672(false, 19);
            }
            this.field957 = true;
            this.method680(111);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field972[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZLica;)V", line = 191)
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            if (arg1) {
                this.field957 = false;
            }
            if (arg2 != null) {
                if (this.field956) {
                    super.field1301.method1669(768, 0, 5890, (byte) -124);
                    super.field1301.method1650(0, (byte) -109, 770, 5890);
                    this.field956 = false;
                }
                super.field1301.method1618((byte) 62, arg2);
                super.field1301.method1631(arg0, 7681);
            } else if (!this.field956) {
                super.field1301.method1618((byte) -103, super.field1301.field2833);
                super.field1301.method1631(1, 7681);
                super.field1301.method1669(768, 0, 34168, (byte) -115);
                super.field1301.method1650(0, (byte) -109, 770, 34168);
                this.field956 = true;
            }
            ++field954;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field972[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field972[4] : field972[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 228)
    public final void method680(int arg0) {
        try {
            if (this.field957) {
                int var2 = super.field1301.method187();
                int var3 = super.field1301.method195();
                float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
                float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field1301.field2905, (float) super.field1301.field2835 / 255.0F);
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1638(false, super.field1301.field2897);
                super.field1301.method1619(0, (byte) 125);
            }
            int var6 = -71 / ((-17 - arg0) / 47);
            ++field962;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field972[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZII)V", line = 254)
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            ++field966;
            if (arg0) {
                this.method673(true, 39);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field972[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZ)V", line = 265)
    public static final void method682(int arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                class158.method1337(class710.field9921, arg1, -1);
            } else {
                class274 var3 = class375.method2969((byte) 1, class236.field3415, class60.field916.field11100);
                var3.field3885.method5138((byte) -98, arg1);
                class60.field916.method5608(var3, 29867);
            }
            if (arg0 >= 79) {
                ++field952;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field972[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZB)V", line = 287)
    public final void method683(boolean arg0, byte arg1) {
        try {
            ++field950;
            if (arg1 != -54) {
                this.field961 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field972[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method684(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method685(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
