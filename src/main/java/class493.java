import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class493 extends class657 {

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    private boolean field7071 = false;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Ljt;")
    private class114 field7080;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Ljt;")
    private class114 field7090;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Ljt;")
    private class114 field7091;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Ljt;")
    private class114 field7079;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Z")
    private boolean field7072;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "Lbca;")
    private class689 field7082;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field7092 = new String[] { method3730(method3729("\u007f8\u0015\t)")), method3730(method3729("\u007f8\u0015\u0004)")), method3730(method3729("\u007f8\u0015\u0007)")), method3730(method3729("\u007f8\u0015\u0000)")), method3730(method3729("\u007f8\u0015\u0005)")), method3730(method3729("\u007f8\u0015\n)")), method3730(method3729("`(W/")), method3730(method3729("\u007f8\u0015\u0001)")), method3730(method3729("us\u0015m|")), method3730(method3729("\u007f8\u0015\u0006)")), method3730(method3729("\u007f8\u0015\u007fh`4O})")), method3730(method3729("/|z\u0011Cx-\nm1\u0004\u001co\u0017SG\u001f\u001bch^2Hc!.}\u001bc!.}\u0006cwk/O&y -T0hz4T-:\u0004\u001co\u0017SG\u001f\u001bchM2W,t|}\u001bc!.}\u0006cwk/O&y >T/n|f1\u0002UZ\u000fr\u0001!.4o&yM2T1e.}\u001bc<.+^1uk%\u00157dv>T,sj\u0006\u000b\u001e:\u0004\u0012n\u0017Q[\t\u001bcn^2Hc!.}\u001bc!.}\u0006csk.N/u -T0hz4T-:\u0004\u0012n\u0017Q[\t\u001bcnM2W,t|}\u001bc!.}\u0006csk.N/u >T/n|f1\fTZ\rn\u0017!.2o&yM2T1e>}\u001bc<./^0tb)\u00157dv>T,sj\u0006\u000b\u001e:\u0004\u0012n\u0017Q[\t\u001bcnZ8C\u0000na/_r!.}\u0006csk.N/u )^;ba2I'Z?\u0000\u0000IN[\tk\u0016U.}T\u0005ni\u001eT,sj}\u001bc!3}I&r{1Omga:X,n|9\u0000IQO\u000fz\u000e!.}],f^<I\"l}}\u001bc!3}K1ni/Z./b2X\"mUmfx\u000b^\u001ci\u0002L.}\u001b4`z8I\u0013mo3^c!.`\u001b3sa:I\"l 1T `b\u0006\n\u001e:\u0004\rz\u0011@C}\u001bcuC<O1hv\u0006\u000f\u001e!.}\u0006cz..O\"uksV\"u|4Cmuk%O6sk\u0006\u000b\u001e!sf1\u0013@\\\u001cvc!.-v\"u|4C\u00185S}\u001bc<.&\u001b0uo)^mlo)I*y -I,kk>O*n`}Fx\u000b^\u001ci\u0002L.}\u001b.wC<O1hv\u0006\u000f\u001e!.`\u001b8!})Z7d 0Z7sg%\u0015.nj8W5hk*\u001b>:\u0004\t~\u000eQ.}\u001bcwg8L\u0013n}q\u001b%ni\u001bZ ua/\u0000IE^i\u001bc!x4^4Qa.\u0015;-.0M\u000e`z/R;Z>\u0000\u0017ch^2Hx\u000bJ\r\u000fc!.+R&v^2Hmx\"}V5Lo)I*yUlfo!g\rT0:\u0004\u0019kw!.}M*dy\rT0/tq\u001b.wC<O1hv\u0006\t\u001e-.4k,r5W\u007f\u00135.}\u001b5hk*k,r *\u0017clx\u0010Z7sg%`p\\\"}R\u0013n}f1\u0010TL}\u001bcga:}\"bz2Imy\"}\u00165hk*k,r '\u0017cga:k\"so0Hmy5Wv\u0016M.}\u001b%ni\u001bZ ua/\u0015;-.;T$Go>O,s %\u0017c1 m\u000br8;n\nq45Wv\u0002E.}\u001b%ni\u001bZ ua/\u0015:-.4o&yM2T1e '\u0017cga:k\"so0Hm{\"}],f^<I\"l}sLx\u000b]\byc!.;T$Go>O,s '\u0017c,x4^4Qa.\u00159-.;T$Qo/Z.r $\u0000IL[\u0011\u001bc!h2\\\u0005`m)T1/tq\u001b%ni\u001bZ ua/\u00159-.m\u0015s1=d\u000bu3;f1\u000eTB}\u001bcga:}\"bz2Imy\"}],fH<X7n|sCo!h2\\\u0005`m)T1/wf1\u000eH@}\u001bcga:}\"bz2Io!h2\\\u0005`m)T1-.l\u0000ILO\u0005\u001bc!h2\\\u0005`m)T1-.;T$Go>O,s\"}\u000bx\u000bC\bwc!.;T$Go>O,s '\u0017cga:}\"bz2Im{\"}R\u0017dv\u001eT,sjsAx\u000bC\u001c\u007fc!.+R&v^2Hmyw'\u0017cvo)^1Qb<U&/v$A4-.;T$Go>O,s 'A9{\"}M*dy\rT0/v$A4:\u0004\u0010z\u001b!.}T\u0017dv\u001eT,sjl\u0015;xtq\u001b%ni\u001bZ ua/\u0015;yv%\u0017cga:}\"bz2Imxw$Bx\u000bC\u0012mc!.2o&yM2T1e?sLo!?f1\u000eNX}\u001bcnM2W,t|q\u001b*Ba1T6s5W\u007f\u00135.}\u001b,Qa.\u0015;-.-v\"u|4C\u00181Sq\u001b5hk*k,r5W\u007f\u00135.}\u001b,Qa.\u0015:-.-v\"u|4C\u00180Sq\u001b5hk*k,r5W\u007f\u00135.}\u001b,Qa.\u00159-.-v\"u|4C\u00183Sq\u001b5hk*k,r5W\u007f\u00135.}\u001b,Qa.\u00154-.-v\"u|4C\u00182Sq\u001b5hk*k,r5Wv\fW.}\u001b,Ga:x,n|9\u0015;-.+R&v^2Hm{5W\u007f\u00132.}\u001b,Uk%x,n|9\u000bmy\"}O\u000e`z/R;Z>\u0000\u0017chZ8C\u0000na/_x\u000bJ\r\bc!.2o&yM2T1e>sBo!z\u0010Z7sg%`r\\\"}R\u0017dv\u001eT,sjf1\u000eNX}\u001bcnZ8C\u0000na/_s/t*\u0017chZ8C\u0000na/_x\u000bK\u0013\u007fI")), method3730(method3729("/|z\u0011Cx-\nm1\u0004\u001co\u0017SG\u001f\u001bch^2Hc!.}\u001bc!.}\u0006cwk/O&y -T0hz4T-:\u0004\u001co\u0017SG\u001f\u001bch@2I.`b}\u001bc!.}\u0006cwk/O&y 3T1lo1\u0000I@Z\ti\nC.}R\u0000nb2N1!.}\u001bc!3}M&sz8Cmba1T1:\u0004\u001co\u0017SG\u001f\u001bchZ8C\u0000na/_c!.}\u0006cwk/O&y )^;ba2I'Z>\u0000\u0000IN[\tk\u0016U.}T\u0013n}}\u001bc!.}\u001bc!3}I&r{1Omqa.R7ha3\u0000IN[\tk\u0016U.}T\u0000nb2N1!.}\u001bc!3}I&r{1Omba1T1:\u0004\u0012n\u0017Q[\t\u001bcnZ8C\u0000na/_s!.}\u0006csk.N/u )^;ba2I'Z>\u0000\u0000IN[\tk\u0016U.}T\u0017dv\u001eT,sjl\u001bc!3}I&r{1Omuk%X,n|9`r\\5Wt\u0016U^\boc!a\u001bT$Ba2I'!.}\u001b~!|8H6mzs],fm2T1e5Wk\u0002SO\u0010\u001bc!h2\\\u0013`|<V0!.}\u001b~!~/T$so0\u0015/nm<W\u00181Sf1\u0013@\\\u001cvc!.*Z7d|\rW\"ok}\u001bc<.-I,f|<Vmma>Z/Z?\u0000\u0000IQO\u000fz\u000e!.}K\u000e`z/R;Z:\u0000\u001bc!3}@crz<O&/c<O1hvsK1nd8X7ha3\u001b>:\u0004\rz\u0011@C}\u001bclx\u0010Z7sg%`w\\.}\u0006cz..O\"uksV\"u|4Cmla9^/wg8Lc|5Wk\u0002SO\u0010\u001bc!z8C\u000e`z/R;Z:\u0000\u001b~!u}H7`z8\u0015.`z/R;/z8C7t|8`s\\. \u0000IUK\u0010kc!.}M*dy\rT0-.+R&v@2I.`bq\u001b%ni\u001bZ ua/\u0017cek-O+-.>T/n{/\u0017coj2O/:\u0004\u0019kw!.}M*dy\rT0/vq\u001b.wC<O1hv\u0006\u000b\u001e-.4k,r5W\u007f\u00135.}\u001b5hk*k,r $\u0017clx\u0010Z7sg%`r\\\"}R\u0013n}f1\u0007Q:}\u001bcwg8L\u0013n}sAo!c+v\"u|4C\u00183Sq\u001b*Qa.\u0000IE^i\u001bc!x4^4Qa.\u00154-.0M\u000e`z/R;Z=\u0000\u0017ch^2Hx\u000b]\byc!.;T$Go>O,s %\u0017c,x4^4Qa.\u00159-.;T$Qo/Z.r %\u0000IL[\u0011\u001bc!h2\\\u0005`m)T1/vq\u001b%ni\u001bZ ua/\u0015;-.m\u0015s1?d\u000ep0<h\u0000IE^i\u001bc!j8K7i\"}L\"uk/k/``8\u0017cwg8L\u0013n}f1\u000e@J}\u001bcga:}\"bz2Imx\"}\u0016'd~)So!h2\\\u0013`|<V0/tq\u001b%ni\rZ1`c.\u00154:\u0004\u000en\u0001!.}],fH<X7n|sAo!#+R&v^2Hm{\"}],f^<I\"l}sBx\u000bC\bwc!.;T$Go>O,s '\u0017cga:}\"bz2Im{\"}\u000bm1>n\u0002s7<h\u0000ILG\u0013\u001bc!h2\\\u0005`m)T1-.;T$Go>O,s\"}\nx\u000bC\u001ccc!.;T$Go>O,s\"}],fH<X7n|q\u001bs:\u0004\u0010n\u000f!.}],fH<X7n|sAo!h2\\\u0005`m)T1/tq\u001bnek-O+:\u0004\u0010z\u0007!.}M*dy\rT0/v$Ao!y<O&s^1Z-d %B9v\"}],fH<X7n|sA9{tq\u001b5hk*k,r %B9v5Wv\u0002Y.}\u001b,Uk%x,n|9\nmyw'\u0017cga:}\"bz2Imyv%Co!h2\\\u0005`m)T1/w$B::\u0004\u0010t\u0015!.}T\u0017dv\u001eT,sjl\u00154-.l\u0000IE^n\u001bc!x4^4Oa/V\"m %\u0017clx\u0010Z7sg%`s\\\"}R\rn|0Z/:\u0004\u0019kp!.}M*dy\u0013T1lo1\u0015:-.0M\u000e`z/R;Z?\u0000\u0017ch@2I.`bf1\u0007Q=}\u001bcwg8L\rn|0Z//tq\u001b.wC<O1hv\u0006\t\u001e-.4u,sc<Wx\u000bJ\r\bc!.3_,ubsCo!x4^4Oa/V\"m\"}H7`z8\u0015/hi5O\u00181SsK,rg)R,o5W\u007f\u00132.}\u001b-ea)Wmx\"}M*dy\u0013T1lo1\u0017crz<O&/b4\\+uUlfmqa.R7ha3\u0000ILO\u0005\u001bc!`9T7m\"}U'nz1\u0017c15Wv\fW.}\u001b nb2N1-..O\"uksW*ff)V,ek1\u0015\"ll4^-u5Wv\u0002E.}\u001b nb2N1-..O\"uksW*ff)`s\\ 9R%g{.^o!`9T7m %C;y\"}X,ma(Ix\u000bC\u001c\u007fc!.>T/n{/\u0017crz<O&/b4\\+uUlfmeg;]6rkq\u001b-ea)Wmxw$Bo!m2W,t|f1\u000eTB}\u001bcnM2W,t|q\u001b*Ba1T6s\"}X,ma(Ix\u000bJ\r\u000fc!.2k,r %\u0017cqC<O1hv\u0006\u000b\u001e-.+R&v^2Hx\u000bJ\r\u000fc!.2k,r $\u0017cqC<O1hv\u0006\n\u001e-.+R&v^2Hx\u000bJ\r\u000fc!.2k,r '\u0017cqC<O1hv\u0006\t\u001e-.+R&v^2Hx\u000bJ\r\u000fc!.2k,r *\u0017cqC<O1hv\u0006\b\u001e-.+R&v^2Hx\u000bC\u0012mc!.2},fM2T1e %\u0017cwg8L\u0013n}sAx\u000bJ\r\u000fc!.2o&yM2T1e>sCo!z8C\u000e`z/R;Z>\u0000\u0017chZ8C\u0000na/_x\u000bJ\r\u000fc!.2o&yM2T1e>sBo!z8C\u000e`z/R;Z?\u0000\u0017chZ8C\u0000na/_x\u000bJ\r\u000fc!.2o&yM2T1e>sAo!z8C\u000e`z/R;Z<\u0000\u0017chZ8C\u0000na/_x\u000bC\u0012mc!.2o&yM2T1e>sLo!?f1\u0006OJW")), method3730(method3729("/|z\u0011Cx-\nm1\u0004\u001co\u0017SG\u001f\u001bch^2Hc!.}\u001bc!.}\u0006cwk/O&y -T0hz4T-:\u0004\u001co\u0017SG\u001f\u001bch@2I.`b}\u001bc!.}\u0006cwk/O&y 3T1lo1\u0000I@Z\ti\nC.}R\u0000nb2N1!.}\u001bc!3}M&sz8Cmba1T1:\u0004\u001co\u0017SG\u001f\u001bchZ8C\u0000na/_c!.}\u0006cwk/O&y )^;ba2I'Z>\u0000\u0000IN[\tk\u0016U.}T\u0013n}}\u001bc!.}\u001bc!3}I&r{1Omqa.R7ha3\u0000IN[\tk\u0016U.}T\u0000nb2N1!.}\u001bc!3}I&r{1Omba1T1:\u0004\u0012n\u0017Q[\t\u001bcnZ8C\u0000na/_s!.}\u0006csk.N/u )^;ba2I'Z>\u0000\u0000IN[\tk\u0016U.}T\u0017dv\u001eT,sjl\u001bc!3}I&r{1Omuk%X,n|9`r\\5Wt\u0016U^\boc!a\u001bT$Ba2I'!.}\u001b~!|8H6mzs],fm2T1e5Wk\u0002SO\u0010\u001bc!h2\\\u0013`|<V0!.}\u001b~!~/T$so0\u0015/nm<W\u00181Sf1\u0013@\\\u001cvc!.*Z7d|\rW\"ok}\u001bc<.-I,f|<Vmma>Z/Z?\u0000\u0000IQO\u000fz\u000e!.}O\u000e`z/R;Z:\u0000\u001bc!3}@crz<O&/c<O1hvsO&yz(I&Z>\u0000\u001b>:\u0004\rz\u0011@C}\u001bcqC<O1hv\u0006\u000f\u001e!.}\u0006cz..O\"uksV\"u|4Cmq|2Q&bz4T-!sf1\u0013@\\\u001cvc!.0M\u000e`z/R;Z:\u0000\u001bc<.&\u001b0uo)^mlo)I*y 0T'db+R&v. \u0000IUK\u0010kc!.}M*dy\rT0-.+R&v@2I.`bq\u001b%ni\u001bZ ua/\u0017cba1T6s\"}U'nz1\u0000IE^i\u001bc!x4^4Qa.\u0015;-.0M\u000e`z/R;Z>\u0000\u0017ch^2Hx\u000bJ\r\u000fc!.+R&v^2Hmx\"}V5Lo)I*yUlfo!g\rT0:\u0004\u0019kw!.}M*dy\rT0/tq\u001b.wC<O1hv\u0006\t\u001e-.4k,r5W\u007f\u00135.}\u001b5hk*k,r *\u0017clx\u0010Z7sg%`p\\\"}R\u0013n}f1\u0010TL}\u001bcga:}\"bz2Imy\"}\u00165hk*k,r '\u0017cga:k\"so0Hmy5Wv\u0016M.}\u001b%ni\u001bZ ua/\u0015;-.;T$Go>O,s %\u0017c1 m\u000br8;n\nq45Wv\u0002E.}\u001b%ni\u001bZ ua/\u0015:-.4o&yM2T1e '\u0017cga:k\"so0Hm{\"}],f^<I\"l}sLx\u000b]\byc!.;T$Go>O,s '\u0017c,x4^4Qa.\u00159-.;T$Qo/Z.r $\u0000IL[\u0011\u001bc!h2\\\u0005`m)T1/tq\u001b%ni\u001bZ ua/\u00159-.m\u0015s1=d\u000bu3;f1\u000eTB}\u001bcga:}\"bz2Imy\"}],fH<X7n|sCo!h2\\\u0005`m)T1/wf1\u000eH@}\u001bcga:}\"bz2Io!h2\\\u0005`m)T1-.l\u0000ILO\u0005\u001bc!h2\\\u0005`m)T1-.;T$Go>O,s\"}\u000bx\u000bC\bwc!.;T$Go>O,s '\u0017cga:}\"bz2Im{\"}R\u0017dv\u001eT,sjsAx\u000bC\u001c\u007fc!.+R&v^2Hmyw'\u0017cvo)^1Qb<U&/v$A4-.;T$Go>O,s 'A9{\"}M*dy\rT0/v$A4:\u0004\u0010z\u001b!.}T\u0017dv\u001eT,sjl\u0015;xtq\u001b%ni\u001bZ ua/\u0015;yv%\u0017cga:}\"bz2Imxw$Bx\u000bC\u0012mc!.2o&yM2T1e?sLo!?f1\u0007Q=}\u001bcwg8L\rn|0Z//vq\u001b.wC<O1hv\u0006\u000b\u001e-.4u,sc<Wx\u000bJ\r\bc!.+R&v@2I.`bsBo!c+v\"u|4C\u00180Sq\u001b*Oa/V\"m5W\u007f\u00132.}\u001b5hk*u,sc<Wm{\"}V5Lo)I*yUofo!g\u0013T1lo1\u0000IE^n\u001bc!`9T7m %\u0017cwg8L\rn|0Z/-..O\"uksW*ff)`s\\ -T0hz4T-:\u0004\u0019kp!.}U'nz1\u0015:-.+R&v@2I.`bq\u001b0uo)^mmg:S7Z?\u0000\u00153n}4O*n`f1\u000e@V}\u001bcoj2O/-.3_,ubq\u001bs:\u0004\u0010t\u0015!.}X,ma(Io!})Z7d 1R$iz0T'dbsZ.cg8U7:\u0004\u0010z\u0007!.}X,ma(Io!})Z7d 1R$iz\u0006\u000b\u001e/j4]%t}8\u0017coj2O//v%C;-.>T/n{/\u0000ILO\u0019\u001bc!m2W,t|q\u001b0uo)^mmg:S7Z?\u0000\u0015'hh;N0d\"}U'nz1\u0015:xw$\u0017cba1T6s5Wv\u0016M.}\u001b,Ba1T6s\"}R\u0000nb2N1-.>T/n{/\u0000IE^i\u001bc!a\rT0/vq\u001b3Lo)I*yUmfo!x4^4Qa.\u0000IE^i\u001bc!a\rT0/wq\u001b3Lo)I*yUlfo!x4^4Qa.\u0000IE^i\u001bc!a\rT0/tq\u001b3Lo)I*yUofo!x4^4Qa.\u0000IE^i\u001bc!a\rT0/yq\u001b3Lo)I*yUnfo!x4^4Qa.\u0000ILA\u000b\u001bc!a\u001bT$Ba2I'/vq\u001b5hk*k,r '\u0000IE^n\u001bc!a\t^;Ba2I'1 %\u0017cuC<O1hv\u0006\u000b\u001e-.4o&yM2T1e5W\u007f\u00132.}\u001b,Uk%x,n|9\u000bmx\"}O\u000e`z/R;Z?\u0000\u0017chZ8C\u0000na/_x\u000bC\u0012mc!.2o&yM2T1e>sA4-.4o&yM2T1e5W~\rE\u0004")), method3730(method3729("/|z\u0011Cx-\nm1\u0004\u001co\u0017SG\u001f\u001bch^2Hc!.}\u001bc!.}\u0006cwk/O&y -T0hz4T-:\u0004\u001co\u0017SG\u001f\u001bchM2W,t|}\u001bc!.}\u0006cwk/O&y >T/n|f1\u0002UZ\u000fr\u0001!.4o&yM2T1e.}\u001bc<.+^1uk%\u00157dv>T,sj\u0006\u000b\u001e:\u0004\u0012n\u0017Q[\t\u001bcn^2Hc!.}\u001bc!.}\u0006csk.N/u -T0hz4T-:\u0004\u0012n\u0017Q[\t\u001bcnM2W,t|}\u001bc!.}\u0006csk.N/u >T/n|f1\fTZ\rn\u0017!.2o&yM2T1e>}\u001bc<./^0tb)\u00157dv>T,sj\u0006\u000b\u001e:\u0004\u0012n\u0017Q[\t\u001bcnZ8C\u0000na/_r!.}\u0006csk.N/u )^;ba2I'Z?\u0000\u0000IN[\tk\u0016U.}T\u0005ni\u001eT,sj}\u001bc!3}I&r{1Omga:X,n|9\u0000IQO\u000fz\u000e!.}],f^<I\"l}}\u001bc!3}K1ni/Z./b2X\"mUmfx\u000b^\u001ci\u0002L.}\u001b4`z8I\u0013mo3^c!.`\u001b3sa:I\"l 1T `b\u0006\n\u001e:\u0004\rz\u0011@C}\u001bcqC<O1hv\u0006\u000f\u001e!.}\u0006cz..O\"uksV\"u|4Cmq|2Q&bz4T-!sf1\u0013@\\\u001cvc!.0M\u000e`z/R;Z:\u0000\u001bc<.&\u001b0uo)^mlo)I*y 0T'db+R&v. \u0000IQO\u000fz\u000e!.}O&yC<O1hv\u0006\u000f\u001e!3}@crz<O&/c<O1hvsO&yz(I&Z>\u0000\u001b>:\u0004\t~\u000eQ.}\u001bcwg8L\u0013n}q\u001b%ni\u001bZ ua/\u0017cek-O+:\u0004\u0019kw!.}M*dy\rT0/vq\u001b.wC<O1hv\u0006\u000b\u001e-.4k,r5W\u007f\u00135.}\u001b5hk*k,r $\u0017clx\u0010Z7sg%`r\\\"}R\u0013n}f1\u0007Q:}\u001bcwg8L\u0013n}sAo!c+v\"u|4C\u00183Sq\u001b*Qa.\u0000IE^i\u001bc!x4^4Qa.\u00154-.0M\u000e`z/R;Z=\u0000\u0017ch^2Hx\u000b]\byc!.;T$Go>O,s %\u0017c,x4^4Qa.\u00159-.;T$Qo/Z.r %\u0000IL[\u0011\u001bc!h2\\\u0005`m)T1/vq\u001b%ni\u001bZ ua/\u0015;-.m\u0015s1?d\u000ep0<h\u0000IE^i\u001bc!j8K7i\"}L\"uk/k/``8\u0017cwg8L\u0013n}f1\u000e@J}\u001bcga:}\"bz2Imx\"}\u0016'd~)So!h2\\\u0013`|<V0/tq\u001b%ni\rZ1`c.\u00154:\u0004\u000en\u0001!.}],fH<X7n|sAo!#+R&v^2Hm{\"}],f^<I\"l}sBx\u000bC\bwc!.;T$Go>O,s '\u0017cga:}\"bz2Im{\"}\u000bm1>n\u0002s7<h\u0000ILG\u0013\u001bc!h2\\\u0005`m)T1-.;T$Go>O,s\"}\nx\u000bC\u001ccc!.;T$Go>O,s\"}],fH<X7n|q\u001bs:\u0004\u0010n\u000f!.}],fH<X7n|sAo!h2\\\u0005`m)T1/tq\u001bnek-O+:\u0004\u0010z\u0007!.}M*dy\rT0/v$Ao!y<O&s^1Z-d %B9v\"}],fH<X7n|sA9{tq\u001b5hk*k,r %B9v5Wv\u0002Y.}\u001b,Uk%x,n|9\nmyw'\u0017cga:}\"bz2Imyv%Co!h2\\\u0005`m)T1/w$B::\u0004\u0010t\u0015!.}T\u0017dv\u001eT,sjl\u00154-.l\u0000ILA\u000b\u001bc!a\u001eT/n{/\u0017chM2W,t|f1\u0007Q:}\u001bcn^2Hmy\"}K\u000e`z/R;Z>\u0000\u0017cwg8L\u0013n}f1\u0007Q:}\u001bcn^2Hmx\"}K\u000e`z/R;Z?\u0000\u0017cwg8L\u0013n}f1\u0007Q:}\u001bcn^2Hm{\"}K\u000e`z/R;Z<\u0000\u0017cwg8L\u0013n}f1\u0007Q:}\u001bcn^2Hmv\"}K\u000e`z/R;Z=\u0000\u0017cwg8L\u0013n}f1\u000eNX}\u001bcnH2\\\u0000na/_my\"}M*dy\rT0/tf1\u0007Q:}\u001bcnZ8C\u0000na/_s/vq\u001b7dv\u0010Z7sg%`s\\\"}R\u0017dv\u001eT,sjf1\u0007Q:}\u001bcnZ8C\u0000na/_s/wq\u001b7dv\u0010Z7sg%`r\\\"}R\u0017dv\u001eT,sjf1\u0007Q:}\u001bcnZ8C\u0000na/_s/tq\u001b7dv\u0010Z7sg%`q\\\"}R\u0017dv\u001eT,sjf1\u000eNX}\u001bcnZ8C\u0000na/_s/yq\u001br:\u0004\u0018u\u0007\u000b")), method3730(method3729("\u007f8\u0015\u000b)")), method3730(method3729("\u007f8\u0015\u0002)")) };

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Z")
    public static boolean field7069 = false;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field7076 = 0;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field7070 = 0;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "F")
    public static float field7085;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "Llq;")
    public static class578 field7083;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    private boolean field7077;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Z")
    private boolean field7081;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZ)V")
    public final void method6(byte arg0, boolean arg1) {
        try {
            if (arg0 == 38) {
                ++field7089;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7092[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        try {
            ++field7084;
            if (this.field7077) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field7077 = false;
            }
            super.field9490.method1716(33984, 1);
            super.field9490.method1733((class517) null, arg0 ^ 17237);
            super.field9490.method1684((byte) -61, 8448, 8448);
            super.field9490.method1739(5890, arg0, (byte) 19, 768);
            super.field9490.method1739(34166, 2, (byte) 19, 770);
            super.field9490.method1683(770, 32888, 5890, 0);
            super.field9490.method1716(33984, 0);
            if (this.field7071) {
                super.field9490.method1739(5890, 0, (byte) 19, 768);
                super.field9490.method1683(770, arg0 ^ 32888, 5890, 0);
                this.field7071 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7092[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method3725(int arg0) {
        try {
            if (this.field7077) {
                int var2 = super.field9490.method558();
                int var3 = super.field9490.method583();
                float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
                float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9490.field2984, (float) super.field9490.field2990 / 255.0F);
                super.field9490.method1716(33984, 1);
                super.field9490.method1693(super.field9490.field2942, 8705);
                super.field9490.method1716(33984, 0);
            }
            ++field7078;
            if (arg0 != 1) {
                field7069 = false;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7092[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        try {
            ++field7087;
            int var2 = 8 % ((-17 - arg0) / 42);
            return this.field7072;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7092[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public final void method3726(byte arg0) {
        try {
            ++field7086;
            class768 var2 = super.field9490.field2884;
            if (this.field7081) {
                OpenGL.glBindProgramARB(34336, super.field9490.field2978 != Integer.MAX_VALUE ? this.field7079.field1351 : this.field7090.field1351);
            } else {
                OpenGL.glBindProgramARB(34336, ~super.field9490.field2978 == Integer.MIN_VALUE ? this.field7080.field1351 : this.field7091.field1351);
            }
            var2.method5544(arg0 + -83, -1.0F, 0.0F, class779.field11350, 0.0F, (float) super.field9490.field2978);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class779.field11350[0], class779.field11350[1], class779.field11350[2], class779.field11350[3]);
            OpenGL.glEnable(34336);
            this.field7077 = true;
            if (arg0 == -44) {
                this.method3725(1);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7092[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static void method3727(int arg0) {
        try {
            if (arg0 == 31359) {
                field7083 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7092[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)V")
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            ++field7074;
            if (!arg2) {
                field7076 = 75;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7092[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLmw;)V")
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            if (arg1 < 117) {
                method3727(-79);
            }
            if (arg2 != null) {
                if (this.field7071) {
                    super.field9490.method1739(5890, 0, (byte) 19, 768);
                    super.field9490.method1683(770, 32888, 5890, 0);
                    this.field7071 = false;
                }
                super.field9490.method1733(arg2, 17237);
                super.field9490.method1753(0, arg0);
            } else if (!this.field7071) {
                super.field9490.method1733(super.field9490.field2954, 17237);
                super.field9490.method1753(0, 1);
                super.field9490.method1739(34168, 0, (byte) 19, 768);
                super.field9490.method1683(770, 32888, 34168, 0);
                this.field7071 = true;
            }
            ++field7075;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7092[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7092[8] : field7092[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
    public final void method3(boolean arg0, int arg1) {
        try {
            this.field7081 = arg0;
            ++field7073;
            super.field9490.method1716(33984, arg1);
            super.field9490.method1733(this.field7082, 17237);
            super.field9490.method1684((byte) -61, 7681, 34165);
            super.field9490.method1739(34166, 0, (byte) 19, 768);
            super.field9490.method1739(5890, 2, (byte) 19, 770);
            super.field9490.method1683(770, arg1 ^ 32889, 34168, 0);
            super.field9490.method1716(33984, 0);
            this.method3726((byte) -44);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7092[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lffa;)V")
    public class493(class197 arg0) {
        super(arg0);
        try {
            if (super.field9490.field2946) {
                this.field7080 = class171.method1521(field7092[11], (byte) 124, super.field9490, 34336);
                this.field7090 = class171.method1521(field7092[13], (byte) 104, super.field9490, 34336);
                this.field7091 = class171.method1521(field7092[14], (byte) 120, super.field9490, 34336);
                this.field7079 = class171.method1521(field7092[12], (byte) 127, super.field9490, 34336);
                if (!(this.field7091 != null & this.field7090 != null & this.field7080 != null & this.field7079 != null)) {
                    this.field7072 = false;
                } else {
                    this.field7082 = new class689(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                    this.field7082.method5046(false, (byte) -111, false);
                    this.field7072 = true;
                }
            } else {
                this.field7072 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7092[10] + (arg0 != null ? field7092[8] : field7092[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)Z")
    public static final boolean method3728(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != -101) {
                field7069 = false;
            }
            ++field7088;
            return class443.method3404(arg0 ^ -7184, arg2, arg1) | ~(arg1 & 393216) != -1 || class6.method40(arg2, 58, arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7092[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3729(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3730(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
