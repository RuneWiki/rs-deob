import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class75 extends class14 {
   @OriginalMember(
      owner = "client!qh",
      name = "v",
      descriptor = "Z"
   )
   private boolean field924 = false;
   @OriginalMember(
      owner = "client!qh",
      name = "x",
      descriptor = "Z"
   )
   private boolean field940;
   @OriginalMember(
      owner = "client!qh",
      name = "D",
      descriptor = "Lko;"
   )
   private class533 field941;
   @OriginalMember(
      owner = "client!qh",
      name = "I",
      descriptor = "Lko;"
   )
   private class533 field938;
   @OriginalMember(
      owner = "client!qh",
      name = "s",
      descriptor = "Lko;"
   )
   private class533 field937;
   @OriginalMember(
      owner = "client!qh",
      name = "u",
      descriptor = "Lko;"
   )
   private class533 field925;
   @OriginalMember(
      owner = "client!qh",
      name = "C",
      descriptor = "Lbha;"
   )
   private class601 field934;
   @OriginalMember(
      owner = "client!qh",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field942 = new String[]{method689(method688("l\u0001\u001aF/")), method689(method688("l\u0001\u001aE/")), method689(method688("l\u0001\u001aO/")), method689(method688("<Hu\\Ek\u0019\u0005 7\u0017(`ZUT+\u0014.nM\u0006G.'=I\u0014.'=I\t.qx\u001b@k\u007f3\u0019[}ni\u0000[`<\u0017(`ZUT+\u0014.nS\u0006FcfqI\u0014.'=I\t.qx\u001b@k\u007f3\u0007[|j|\u0005\u000f\u0004FI=fGE=I]Mhq\u0006A|'=I\u0014.' IBkui\fL dr\u0005[|<\u0017(`ZUT+\u0014.nI\fLMhr\u001bP.'=I\t.qx\u001b@k\u007f3\u001dQvdr\u0006Fj\\-4\u000f\u0004HH=d[S=I[^hnI\u0014.'=I\u0014.' IFkth\u0005@ wr\u001a]znr\u0007\u000f\u0004HH=d[S=I[Mhq\u0006A|'=I\u0014.' IFkth\u0005@ dr\u0005[|<\u0017&aZWH=\u0014.hI\fLMhr\u001bP>'=I\t.ux\u001aAbs3\u001dQvdr\u0006Fj\\-4\u000f\u0004HH=d[S=I[Zbe*[auyX\u0014.' IFkth\u0005@ sx\u0011Waho\ro?Z&c{[SM<`.'r/[iDr\u0006Fj'=I\u00143'o\fG{kiGRa`~\u0006[|c&cdOU\\$\u0014.'{\u0006S^fo\bY}'=I\u00143'm\u001b[iu|\u0004\u001abh~\bXU7@R>^FO(y.'=\u001eUzbo9XoixI\u0014.:=\u0019Fa`o\bY kr\nUb\\,4\u000f\u0004W\\;uC'=IDCfi\u001b]v\\)4\u0014.' IO.ti\b@k)p\b@|neGD|hw\fWznr\u0007\u0014s<\u00179u\\FPI\u0014.jk$Uzut\u0011o:Z=I\t.|=\u001a@osxGYoso\u0000L jr\rQbqt\fC.z&cdOU\\$\u0014.'i\fLCfi\u001b]v\\)4\u00143'fIGzfi\f\u001acfi\u001b]v)i\fLzro\fo>Z=\u0014\u000f\u0004SX$d.'=IBgbj9[}+=\u001f]kpS\u0006FcfqE\u0014hhz/Umsr\u001b\u0018.cx\u0019@f+=\n[bhh\u001b\u0018.iy\u0006@b<\u0017-d:'=IBgbj9[})eE\u0014cqP\b@|ne2\u0004S+=\u0000dat&cp^3=I\u0014xnx\u001edat3\u0010\u0018.jk$Uzut\u0011o?Z1I]^hnR>JW)I\u0014.qt\fC^hnGN\"'p\u001fyoso\u0000LU5@E\u0014gWr\u001a\u000f\u0004CM]\u0014.'k\u0000QyWr\u001a\u001ay+=\u0004BCfi\u001b]v\\.4\u0018.nM\u0006G5\rN<v.'=\u000f[iA|\n@au3\u0011\u0018.*k\u0000QyWr\u001a\u001at+=\u000f[iW|\u001bUct3\u0011\u000f\u0004JH%\u0014.'{\u0006SHf~\u001d[|)eE\u0014hhz/Umsr\u001b\u001av+=Y\u001a>7,P\u0001=6/\\\u000f\u0004CM]\u0014.'y\fDzo1ICosx\u001bdbfs\f\u0018.qt\fC^hnR>CFYI\u0014.ar\u000erodi\u0006F ~1I\u0019jbm\u001d\\\"'{\u0006S^fo\bY})gE\u0014hhz9U|fp\u001a\u001ay<\u0017:aL'=IRa`[\bWzhoGN\"'0\u001f]kpM\u0006G }1IRa`M\bFojnGM5\rP<x.'=\u000f[iA|\n@au3\u0013\u0018.ar\u000erodi\u0006F }1I\u0004 7-Z\r>1/\\\u000f\u0004JT'\u0014.'{\u0006SHf~\u001d[|+=\u000f[iA|\n@au1I\u00055\rP(l.'=\u000f[iA|\n@au1IRa`[\bWzhoE\u0014><\u0017$aB'=IRa`[\bWzhoGN\"'{\u0006SHf~\u001d[|)gE\u0014#cx\u0019@f<\u0017$uJ'=IBgbj9[})e\u0010N\"'j\b@kuM\u0005U`b3\u0011Mtp1IRa`[\bWzhoGNt}gE\u0014xnx\u001edat3\u0011Mtp&cyO_=I\u0014aSx\u0011waho\r\u0005 \u007fd\u0013\u0018.ar\u000erodi\u0006F \u007fe\u0011L\"'{\u0006SHf~\u001d[|)d\u0010Mw<\u0017${X'=I[Zbe*[auyX\u001ay+=X\u000f\u0004CMZ\u0014.'k\u0000QyIr\u001bYok3\u0011\u0018.jk$Uzut\u0011o>Z1I]@ho\u0004Ub<\u0017-d='=IBgbj'[|j|\u0005\u001aw+=\u0004BCfi\u001b]v\\,4\u0018.nS\u0006FcfqR>JW.I\u0014.qt\fC@ho\u0004Ub)gE\u0014cqP\b@|ne2\u0006S+=\u0000zaup\bX5\rY9\u0007.'=\u0007PasqGL\"'k\u0000QyIr\u001bYok1IGzfi\f\u001abnz\u0001@U7@GDatt\u001d]ai&cp^4=I\u0014`cr\u001dX ~1IBgbj'[|j|\u0005\u0018.ti\b@k)q\u0000SfsFXi wr\u001a]znr\u0007\u000f\u0004J\\1\u0014.'s\r[zk1IZjhi\u0005\u0018.7&cyAQ=I\u0014mhq\u0006A|+=\u001a@osxGXg`u\u001dYacx\u0005\u001aoj\u007f\u0000Q`s&cyOC=I\u0014mhq\u0006A|+=\u001a@osxGXg`u\u001do>Z3\r]hah\u001aQ\"'s\r[zk3\u0011Lv\u007f1IWakr\u001cF5\rP(p.'=\n[bhh\u001b\u0018.ti\b@k)q\u0000SfsFXi ct\u000fR{txE\u0014`cr\u001dX ~d\u0010M\"'~\u0006XaroR>CRQI\u0014.h^\u0006XaroE\u0014gDr\u0005[{u1IWakr\u001cF5\rY9\u0000.'=\u0006dat3\u0011\u0018.wP\b@|ne2\u0004S+=\u001f]kpM\u0006G5\rY9\u0000.'=\u0006dat3\u0010\u0018.wP\b@|ne2\u0005S+=\u001f]kpM\u0006G5\rY9\u0000.'=\u0006dat3\u0013\u0018.wP\b@|ne2\u0006S+=\u001f]kpM\u0006G5\rY9\u0000.'=\u0006dat3\u001e\u0018.wP\b@|ne2\u0007S+=\u001f]kpM\u0006G5\rP&b.'=\u0006ra`^\u0006[|c3\u0011\u0018.qt\fC^hnGN5\rY9\u0000.'=\u0006`k\u007f^\u0006[|c-GL\"'i\fLCfi\u001b]v\\-4\u0018.nI\fLMhr\u001bP5\rY9\u0000.'=\u0006`k\u007f^\u0006[|c-GM\"'i\fLCfi\u001b]v\\,4\u0018.nI\fLMhr\u001bP5\rY9\u0000.'=\u0006`k\u007f^\u0006[|c-GN\"'i\fLCfi\u001b]v\\/4\u0018.nI\fLMhr\u001bP5\rP&b.'=\u0006`k\u007f^\u0006[|c-GC\"',R>KIYc")), method689(method688("<Hu\\Ek\u0019\u0005 7\u0017(`ZUT+\u0014.nM\u0006G.'=I\u0014.'=I\t.qx\u001b@k\u007f3\u0019[}ni\u0000[`<\u0017(`ZUT+\u0014.n^\u0006XaroI\u0014.'=I\t.qx\u001b@k\u007f3\n[bhoR>OSI;}L'=\u0000`k\u007f^\u0006[|c=I\u0014.:=\u001fQ|sx\u0011\u001azbe\n[auy2\u0004S<\u0017&aZWH=\u0014.hM\u0006G.'=I\u0014.'=I\t.ux\u001aAbs3\u0019[}ni\u0000[`<\u0017&aZWH=\u0014.h^\u0006XaroI\u0014.'=I\t.ux\u001aAbs3\n[bhoR>ARI9aZ'=\u0006`k\u007f^\u0006[|c-I\u0014.:=\u001bQ}rq\u001d\u001azbe\n[auy2\u0004S<\u0017&aZWH=\u0014.hI\fLMhr\u001bP?'=I\t.ux\u001aAbs3\u001dQvdr\u0006Fj\\,4\u000f\u0004HH=d[S=I[Hhz*[auyI\u0014.' IFkth\u0005@ ar\u000eWaho\r\u000f\u0004W\\;uC'=IRa`M\bFojnI\u0014.' ID|hz\u001bUc)q\u0006WokFYi5\rM(fOJ=I\u0014yfi\fF^k|\u0007Q.'=T\u0014~ur\u000eFoj3\u0005[mfq2\u0005S<\u00179u\\FPI\u0014.sP\b@|ne2\u0000S'=I\t.|=\u001a@osxGYoso\u0000L sx\u0011@{ux2\u0004S'`R>^FO(y.'=\u0019yoso\u0000LU3@I\u0014.:=\u0012\u0014}s|\u001dQ j|\u001dFg\u007f3\u0019Famx\n@ghsII5\rM(fOJ=I\u0014cqP\b@|ne2\u0000S'=T\u0014u'n\u001dUzb3\u0004Uzut\u0011\u001achy\fXxnx\u001e\u0014s<\u0017=qCW=I\u0014.qt\fC^hnE\u0014hhz/Umsr\u001b\u000f\u0004CM]\u0014.'k\u0000QyWr\u001a\u001av+=\u0004BCfi\u001b]v\\-4\u0018.nM\u0006G5\rY9\u0000.'=\u001f]kpM\u0006G ~1IYxJ|\u001dFg\u007fFXi\"'t9[}<\u0017-d:'=IBgbj9[})gE\u0014cqP\b@|ne2\u0006S+=\u0000dat&cp^3=I\u0014xnx\u001edat3\u001e\u0018.jk$Uzut\u0011o=Z1I]^hnR>]R_I\u0014.ar\u000erodi\u0006F \u007f1I\u0019xnx\u001edat3\u0013\u0018.ar\u000edou|\u0004G \u007f&cy[K=I\u0014hhz/Umsr\u001b\u001av+=\u000f[iA|\n@au3\u0011\u0018.73Y\u0004?>(Z\u0005<2&cyOC=I\u0014hhz/Umsr\u001b\u001aw+=\u0000`k\u007f^\u0006[|c3\u0013\u0018.ar\u000edou|\u0004G }1IRa`M\bFojnGC5\rN<v.'=\u000f[iA|\n@au3\u0013\u0018.*k\u0000QyWr\u001a\u001at+=\u000f[iW|\u001bUct3\u0010\u000f\u0004JH%\u0014.'{\u0006SHf~\u001d[|)gE\u0014hhz/Umsr\u001b\u001at+=Y\u001a>7.P\u000485(R>CRQI\u0014.ar\u000erodi\u0006F \u007f1IRa`[\bWzhoGL\"'{\u0006SHf~\u001d[|)dR>CNSI\u0014.ar\u000erodi\u0006F\"'{\u0006SHf~\u001d[|+=X\u000f\u0004J\\1\u0014.'{\u0006SHf~\u001d[|+=\u000f[iA|\n@au1I\u00045\rP<x.'=\u000f[iA|\n@au3\u0013\u0018.ar\u000erodi\u0006F }1I]Zbe*[auyGN5\rP(p.'=\u001f]kpM\u0006G \u007fd\u0013\u0018.p|\u001dQ|Wq\bZk)e\u0010Ny+=\u000f[iA|\n@au3\u0013Nt}1IBgbj9[})e\u0010Ny<\u0017$uV'=I[Zbe*[auyX\u001av~gE\u0014hhz/Umsr\u001b\u001av\u007fe\u0011\u0018.ar\u000erodi\u0006F ~d\u0010M5\rP&b.'=\u0006`k\u007f^\u0006[|c,GC\"',R>CHKI\u0014.h^\u0006XaroE\u0014gDr\u0005[{u&cp^3=I\u0014aWr\u001a\u001av+=\u0019yoso\u0000LU7@E\u0014xnx\u001edat&cp^3=I\u0014aWr\u001a\u001aw+=\u0019yoso\u0000LU6@E\u0014xnx\u001edat&cp^3=I\u0014aWr\u001a\u001at+=\u0019yoso\u0000LU5@E\u0014xnx\u001edat&cp^3=I\u0014aWr\u001a\u001ay+=\u0019yoso\u0000LU4@E\u0014xnx\u001edat&cyAQ=I\u0014aAr\u000ewaho\r\u001av+=\u001f]kpM\u0006G }&cp^4=I\u0014aSx\u0011waho\r\u0004 \u007f1I@Cfi\u001b]v\\-4\u0018.nI\fLMhr\u001bP5\rY9\u0007.'=\u0006`k\u007f^\u0006[|c-GM\"'i$Uzut\u0011o?Z1I]Zbe*[auyR>CHKI\u0014.hI\fLMhr\u001bP>)g\u001e\u0018.nI\fLMhr\u001bP5\rX'p\u0004")), method689(method688("fG\u001a z")), method689(method688("l\u0001\u001a2ns\u0000@0/")), method689(method688("<Hu\\Ek\u0019\u0005 7\u0017(`ZUT+\u0014.nM\u0006G.'=I\u0014.'=I\t.qx\u001b@k\u007f3\u0019[}ni\u0000[`<\u0017(`ZUT+\u0014.n^\u0006XaroI\u0014.'=I\t.qx\u001b@k\u007f3\n[bhoR>OSI;}L'=\u0000`k\u007f^\u0006[|c=I\u0014.:=\u001fQ|sx\u0011\u001azbe\n[auy2\u0004S<\u0017&aZWH=\u0014.hM\u0006G.'=I\u0014.'=I\t.ux\u001aAbs3\u0019[}ni\u0000[`<\u0017&aZWH=\u0014.h^\u0006XaroI\u0014.'=I\t.ux\u001aAbs3\n[bhoR>ARI9aZ'=\u0006`k\u007f^\u0006[|c-I\u0014.:=\u001bQ}rq\u001d\u001azbe\n[auy2\u0004S<\u0017&aZWH=\u0014.hI\fLMhr\u001bP?'=I\t.ux\u001aAbs3\u001dQvdr\u0006Fj\\,4\u000f\u0004HH=d[S=I[Hhz*[auyI\u0014.' IFkth\u0005@ ar\u000eWaho\r\u000f\u0004W\\;uC'=IRa`M\bFojnI\u0014.' ID|hz\u001bUc)q\u0006WokFYi5\rM(fOJ=I\u0014yfi\fF^k|\u0007Q.'=T\u0014~ur\u000eFoj3\u0005[mfq2\u0005S<\u00179u\\FPI\u0014.wP\b@|ne2\u0000S'=I\t.|=\u001a@osxGYoso\u0000L wo\u0006^kdi\u0000[`'`R>^FO(y.'=\u0004BCfi\u001b]v\\)4\u0014.:=\u0012\u0014}s|\u001dQ j|\u001dFg\u007f3\u0004[jbq\u001f]kp=\u0014\u000f\u0004W\\;uC'=I@k\u007fP\b@|ne2\u0000S' IO.ti\b@k)p\b@|neG@k\u007fi\u001cFk\\-4\u0014s<\u0017=qCW=I\u0014.qt\fC^hnE\u0014hhz/Umsr\u001b\u0018.cx\u0019@f<\u0017-d:'=IBgbj9[})eE\u0014cqP\b@|ne2\u0004S+=\u0000dat&cp^3=I\u0014xnx\u001edat3\u0010\u0018.jk$Uzut\u0011o?Z1I]^hnR>JW)I\u0014.qt\fC^hnGN\"'p\u001fyoso\u0000LU5@E\u0014gWr\u001a\u000f\u0004CM]\u0014.'k\u0000QyWr\u001a\u001ay+=\u0004BCfi\u001b]v\\.4\u0018.nM\u0006G5\rN<v.'=\u000f[iA|\n@au3\u0011\u0018.*k\u0000QyWr\u001a\u001at+=\u000f[iW|\u001bUct3\u0011\u000f\u0004JH%\u0014.'{\u0006SHf~\u001d[|)eE\u0014hhz/Umsr\u001b\u001av+=Y\u001a>7,P\u0001=6/\\\u000f\u0004CM]\u0014.'y\fDzo1ICosx\u001bdbfs\f\u0018.qt\fC^hnR>CFYI\u0014.ar\u000erodi\u0006F ~1I\u0019jbm\u001d\\\"'{\u0006S^fo\bY})gE\u0014hhz9U|fp\u001a\u001ay<\u0017:aL'=IRa`[\bWzhoGN\"'0\u001f]kpM\u0006G }1IRa`M\bFojnGM5\rP<x.'=\u000f[iA|\n@au3\u0013\u0018.ar\u000erodi\u0006F }1I\u0004 7-Z\r>1/\\\u000f\u0004JT'\u0014.'{\u0006SHf~\u001d[|+=\u000f[iA|\n@au1I\u00055\rP(l.'=\u000f[iA|\n@au1IRa`[\bWzhoE\u0014><\u0017$aB'=IRa`[\bWzhoGN\"'{\u0006SHf~\u001d[|)gE\u0014#cx\u0019@f<\u0017$uJ'=IBgbj9[})e\u0010N\"'j\b@kuM\u0005U`b3\u0011Mtp1IRa`[\bWzhoGNt}gE\u0014xnx\u001edat3\u0011Mtp&cyO_=I\u0014aSx\u0011waho\r\u0005 \u007fd\u0013\u0018.ar\u000erodi\u0006F \u007fe\u0011L\"'{\u0006SHf~\u001d[|)d\u0010Mw<\u0017${X'=I[Zbe*[auyX\u001ay+=X\u000f\u0004JR?\u0014.'r*[bhh\u001b\u0018.n^\u0006XaroR>JW)I\u0014.hM\u0006G \u007f1IDCfi\u001b]v\\-4\u0018.qt\fC^hnR>JW)I\u0014.hM\u0006G ~1IDCfi\u001b]v\\,4\u0018.qt\fC^hnR>JW)I\u0014.hM\u0006G }1IDCfi\u001b]v\\/4\u0018.qt\fC^hnR>JW)I\u0014.hM\u0006G p1IDCfi\u001b]v\\.4\u0018.qt\fC^hnR>CHKI\u0014.h[\u0006SMhr\u001bP \u007f1IBgbj9[})gR>JW)I\u0014.hI\fLMhr\u001bP>)eE\u0014zbe$Uzut\u0011o>Z1I]Zbe*[auyR>JW)I\u0014.hI\fLMhr\u001bP>)dE\u0014zbe$Uzut\u0011o?Z1I]Zbe*[auyR>JW)I\u0014.hI\fLMhr\u001bP>)gE\u0014zbe$Uzut\u0011o<Z1I]Zbe*[auyR>CHKI\u0014.hI\fLMhr\u001bP>)jE\u0014?<\u0017,zJ\r")), method689(method688("s\u001cXb")), method689(method688("<Hu\\Ek\u0019\u0005 7\u0017(`ZUT+\u0014.nM\u0006G.'=I\u0014.'=I\t.qx\u001b@k\u007f3\u0019[}ni\u0000[`<\u0017(`ZUT+\u0014.nS\u0006FcfqI\u0014.'=I\t.qx\u001b@k\u007f3\u0007[|j|\u0005\u000f\u0004FI=fGE=I]Mhq\u0006A|'=I\u0014.' IBkui\fL dr\u0005[|<\u0017(`ZUT+\u0014.nI\fLMhr\u001bP.'=I\t.qx\u001b@k\u007f3\u001dQvdr\u0006Fj\\-4\u000f\u0004HH=d[S=I[^hnI\u0014.'=I\u0014.' IFkth\u0005@ wr\u001a]znr\u0007\u000f\u0004HH=d[S=I[Mhq\u0006A|'=I\u0014.' IFkth\u0005@ dr\u0005[|<\u0017&aZWH=\u0014.hI\fLMhr\u001bP>'=I\t.ux\u001aAbs3\u001dQvdr\u0006Fj\\-4\u000f\u0004HH=d[S=I[Zbe*[auyX\u0014.' IFkth\u0005@ sx\u0011Waho\ro?Z&c{[SM<`.'r/[iDr\u0006Fj'=I\u00143'o\fG{kiGRa`~\u0006[|c&cdOU\\$\u0014.'{\u0006S^fo\bY}'=I\u00143'm\u001b[iu|\u0004\u001abh~\bXU7@R>^FO(y.'=\u001eUzbo9XoixI\u0014.:=\u0019Fa`o\bY kr\nUb\\,4\u000f\u0004W\\;uC'=I@Cfi\u001b]v\\)4\u0014.' IO.ti\b@k)p\b@|neG@k\u007fi\u001cFk\\-4\u0014s<\u00179u\\FPI\u0014.wP\b@|ne2\u0000S'=I\t.|=\u001a@osxGYoso\u0000L wo\u0006^kdi\u0000[`'`R>^FO(y.'=\u0004BCfi\u001b]v\\)4\u0014.:=\u0012\u0014}s|\u001dQ j|\u001dFg\u007f3\u0004[jbq\u001f]kp=\u0014\u000f\u0004SX$d.'=IBgbj9[}+=\u001f]kpS\u0006FcfqE\u0014hhz/Umsr\u001b\u0018.dr\u0005[{u1IZjhi\u0005\u000f\u0004CM]\u0014.'k\u0000QyWr\u001a\u001av+=\u0004BCfi\u001b]v\\-4\u0018.nM\u0006G5\rY9\u0000.'=\u001f]kpM\u0006G ~1IYxJ|\u001dFg\u007fFXi\"'t9[}<\u0017-d:'=IBgbj9[})gE\u0014cqP\b@|ne2\u0006S+=\u0000dat&cp^3=I\u0014xnx\u001edat3\u001e\u0018.jk$Uzut\u0011o=Z1I]^hnR>]R_I\u0014.ar\u000erodi\u0006F \u007f1I\u0019xnx\u001edat3\u0013\u0018.ar\u000edou|\u0004G \u007f&cy[K=I\u0014hhz/Umsr\u001b\u001av+=\u000f[iA|\n@au3\u0011\u0018.73Y\u0004?>(Z\u0005<2&cyOC=I\u0014hhz/Umsr\u001b\u001aw+=\u0000`k\u007f^\u0006[|c3\u0013\u0018.ar\u000edou|\u0004G }1IRa`M\bFojnGC5\rN<v.'=\u000f[iA|\n@au3\u0013\u0018.*k\u0000QyWr\u001a\u001at+=\u000f[iW|\u001bUct3\u0010\u000f\u0004JH%\u0014.'{\u0006SHf~\u001d[|)gE\u0014hhz/Umsr\u001b\u001at+=Y\u001a>7.P\u000485(R>CRQI\u0014.ar\u000erodi\u0006F \u007f1IRa`[\bWzhoGL\"'{\u0006SHf~\u001d[|)dR>CNSI\u0014.ar\u000erodi\u0006F\"'{\u0006SHf~\u001d[|+=X\u000f\u0004J\\1\u0014.'{\u0006SHf~\u001d[|+=\u000f[iA|\n@au1I\u00045\rP<x.'=\u000f[iA|\n@au3\u0013\u0018.ar\u000erodi\u0006F }1I]Zbe*[auyGN5\rP(p.'=\u001f]kpM\u0006G \u007fd\u0013\u0018.p|\u001dQ|Wq\bZk)e\u0010Ny+=\u000f[iA|\n@au3\u0013Nt}1IBgbj9[})e\u0010Ny<\u0017$uV'=I[Zbe*[auyX\u001av~gE\u0014hhz/Umsr\u001b\u001av\u007fe\u0011\u0018.ar\u000erodi\u0006F ~d\u0010M5\rP&b.'=\u0006`k\u007f^\u0006[|c,GC\"',R>JW.I\u0014.qt\fC@ho\u0004Ub)eE\u0014cqP\b@|ne2\u0004S+=\u0000zaup\bX5\rY9\u0007.'=\u001f]kpS\u0006FcfqGM\"'p\u001fyoso\u0000LU6@E\u0014gIr\u001bYok&cp^4=I\u0014xnx\u001ezaup\bX }1IYxJ|\u001dFg\u007fF[i\"'t'[|j|\u0005\u000f\u0004CMZ\u0014.'s\r[zk3\u0011\u0018.qt\fC@ho\u0004Ub+=\u001a@osxGXg`u\u001do>Z3\u0019[}ni\u0000[`<\u0017-d='=IZjhi\u0005\u001aw+=\u001f]kpS\u0006FcfqE\u0014}s|\u001dQ kt\u000e\\z\\,4\u001a~hn\u0000@ghsR>CFEI\u0014.iy\u0006@b+=\u0007PasqE\u0014><\u0017${X'=IWakr\u001cF\"'n\u001dUzb3\u0005]ioi\u0004[jbqGUcet\fZz<\u0017$uJ'=IWakr\u001cF\"'n\u001dUzb3\u0005]ioi2\u0004S)y\u0000Rhrn\f\u0018.iy\u0006@b)e\u0011Lv+=\n[bhh\u001b\u000f\u0004J\\-\u0014.'~\u0006XaroE\u0014}s|\u001dQ kt\u000e\\z\\,4\u001ajn{\u000fA}b1IZjhi\u0005\u001aw~d\u0010\u0018.dr\u0005[{u&cy[K=I\u0014aDr\u0005[{u1I]Mhq\u0006A|+=\n[bhh\u001b\u000f\u0004CM]\u0014.'r9[})eE\u0014~J|\u001dFg\u007fFYi\"'k\u0000QyWr\u001a\u000f\u0004CM]\u0014.'r9[})dE\u0014~J|\u001dFg\u007fFXi\"'k\u0000QyWr\u001a\u000f\u0004CM]\u0014.'r9[})gE\u0014~J|\u001dFg\u007fF[i\"'k\u0000QyWr\u001a\u000f\u0004CM]\u0014.'r9[})jE\u0014~J|\u001dFg\u007fFZi\"'k\u0000QyWr\u001a\u000f\u0004JR?\u0014.'r/[iDr\u0006Fj)eE\u0014xnx\u001edat3\u0013\u000f\u0004CMZ\u0014.'r=QvDr\u0006Fj73\u0011\u0018.sP\b@|ne2\u0004S+=\u0000`k\u007f^\u0006[|c&cp^4=I\u0014aSx\u0011waho\r\u0004 ~1I@Cfi\u001b]v\\,4\u0018.nI\fLMhr\u001bP5\rP&b.'=\u0006`k\u007f^\u0006[|c-GNy+=\u0000`k\u007f^\u0006[|c&cq@C\u0017")), method689(method688("l\u0001\u001aL/")), method689(method688("l\u0001\u001aK/")), method689(method688("l\u0001\u001aG/")), method689(method688("l\u0001\u001aD/")), method689(method688("l\u0001\u001aM/")), method689(method688("l\u0001\u001aB/")), method689(method688("l\u0001\u001aC/")), method689(method688("l\u0001\u001aI/"))};
   @OriginalMember(
      owner = "client!qh",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field929 = new int[2];
   @OriginalMember(
      owner = "client!qh",
      name = "F",
      descriptor = "F"
   )
   public static float field920;
   @OriginalMember(
      owner = "client!qh",
      name = "A",
      descriptor = "I"
   )
   public static int field919;
   @OriginalMember(
      owner = "client!qh",
      name = "p",
      descriptor = "I"
   )
   public static int field921;
   @OriginalMember(
      owner = "client!qh",
      name = "B",
      descriptor = "I"
   )
   public static int field922;
   @OriginalMember(
      owner = "client!qh",
      name = "G",
      descriptor = "I"
   )
   public static int field923;
   @OriginalMember(
      owner = "client!qh",
      name = "y",
      descriptor = "I"
   )
   public static int field926;
   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "I"
   )
   public static int field927;
   @OriginalMember(
      owner = "client!qh",
      name = "t",
      descriptor = "I"
   )
   public static int field928;
   @OriginalMember(
      owner = "client!qh",
      name = "o",
      descriptor = "I"
   )
   public static int field930;
   @OriginalMember(
      owner = "client!qh",
      name = "H",
      descriptor = "I"
   )
   public static int field931;
   @OriginalMember(
      owner = "client!qh",
      name = "q",
      descriptor = "I"
   )
   public static int field932;
   @OriginalMember(
      owner = "client!qh",
      name = "m",
      descriptor = "I"
   )
   public static int field939;
   @OriginalMember(
      owner = "client!qh",
      name = "E",
      descriptor = "Loe;"
   )
   public static class214 field918;
   @OriginalMember(
      owner = "client!qh",
      name = "r",
      descriptor = "Z"
   )
   private boolean field935;
   @OriginalMember(
      owner = "client!qh",
      name = "n",
      descriptor = "Z"
   )
   private boolean field936;
   @OriginalMember(
      owner = "client!qh",
      name = "w",
      descriptor = "[[[Lkp;"
   )
   public static class517[][][] field933;

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         if (arg0 != 16) {
            method686((byte)-36);
         }

         ++field931;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field942[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method683(byte arg0) {
      try {
         field933 = null;
         field929 = null;
         field918 = null;
         if (arg0 <= 28) {
            field920 = -1.0675459F;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field942[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(BLsl;I)V"
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         ++field922;
         if (arg0 >= 75) {
            if (arg1 == null) {
               if (!this.field924) {
                  super.field157.method4107(-127, super.field157.field8454);
                  super.field157.method4134(1, 2);
                  super.field157.method4096(0, (byte)15, 34168, 768);
                  super.field157.method4141(false, 0, 770, 34168);
                  this.field924 = true;
                  return;
               }
            } else {
               if (this.field924) {
                  super.field157.method4096(0, (byte)15, 5890, 768);
                  super.field157.method4141(false, 0, 770, 5890);
                  this.field924 = false;
               }

               super.field157.method4107(91, arg1);
               super.field157.method4134(arg2, 2);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field942[17] + arg0 + ',' + (arg1 != null ? field942[5] : field942[8]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         this.field935 = arg0;
         ++field928;
         super.field157.method4112((byte)-116, 1);
         super.field157.method4107(arg1 ^ -13236, this.field934);
         super.field157.method4117(34165, 7681, -1);
         super.field157.method4096(0, (byte)15, 34166, 768);
         if (arg1 != 13254) {
            this.method684(-10);
         }

         super.field157.method4096(2, (byte)15, 5890, 770);
         super.field157.method4141(false, 0, 770, 34168);
         super.field157.method4112((byte)110, 0);
         this.method684(arg1 + -13254);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field942[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method684(int arg0) {
      try {
         class507 var2;
         label30: {
            ++field927;
            var2 = super.field157.field8386;
            if (this.field935) {
               OpenGL.glBindProgramARB(34336, ~super.field157.field8485 != Integer.MIN_VALUE ? this.field925.field7600 : this.field938.field7600);
               if (!client.field4360) {
                  break label30;
               }
            }

            OpenGL.glBindProgramARB(34336, super.field157.field8485 == Integer.MAX_VALUE ? this.field941.field7600 : this.field937.field7600);
         }

         var2.method3685(0.0F, true, (float)super.field157.field8485, -1.0F, 0.0F, class564.field8050);
         OpenGL.glProgramLocalParameter4fARB(34336, 1, class564.field8050[arg0], class564.field8050[1], class564.field8050[2], class564.field8050[3]);
         OpenGL.glEnable(34336);
         this.field936 = true;
         this.method687(5890);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field942[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "d",
      descriptor = "(I)Lij;"
   )
   public static final class447 method685(int arg0) {
      try {
         ++field921;
         if (arg0 >= -60) {
            field933 = null;
         }

         return ~class259.field3600 == -1 ? new class447() : class43.field598[--class259.field3600];
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field942[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method686(byte arg0) {
      try {
         class95.field1227 = false;
         ++field932;
         class88.method775((byte)-104);
         if (arg0 != 5) {
            field930 = -47;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field942[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method82(int arg0, int arg1, int arg2) {
      try {
         ++field923;
         if (arg0 != 13880) {
            field933 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field942[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method87(int arg0) {
      try {
         ++field919;
         if (arg0 >= -49) {
            method683((byte)-38);
         }

         return this.field940;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field942[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "<init>",
      descriptor = "(Lea;)V"
   )
   public class75(class573 arg0) {
      super(arg0);

      try {
         if (!super.field157.field8489) {
            this.field940 = false;
         } else {
            this.field941 = class137.method1084(super.field157, false, 34336, field942[4]);
            this.field938 = class137.method1084(super.field157, false, 34336, field942[9]);
            this.field937 = class137.method1084(super.field157, false, 34336, field942[7]);
            this.field925 = class137.method1084(super.field157, false, 34336, field942[3]);
            if (this.field925 != null & this.field937 != null & this.field938 != null & this.field941 != null) {
               this.field934 = new class601(arg0, 3553, 6406, 2, 1, false, new byte[]{0, -1}, 6406, false);
               this.field934.method4372(false, false, (byte)54);
               this.field940 = true;
            } else {
               this.field940 = false;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field942[6] + (arg0 != null ? field942[5] : field942[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method85(int arg0) {
      try {
         if (this.field936) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field936 = false;
         }

         ++field926;
         super.field157.method4112((byte)24, 1);
         if (arg0 != 17328) {
            field933 = null;
         }

         super.field157.method4107(-124, (class486)null);
         super.field157.method4117(8448, 8448, -1);
         super.field157.method4096(0, (byte)15, 5890, 768);
         super.field157.method4096(2, (byte)15, 34166, 770);
         super.field157.method4141(false, 0, 770, 5890);
         super.field157.method4112((byte)29, 0);
         if (this.field924) {
            super.field157.method4096(0, (byte)15, 5890, 768);
            super.field157.method4141(false, 0, 770, 5890);
            this.field924 = false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field942[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method687(int arg0) {
      try {
         ++field939;
         if (arg0 == 5890) {
            if (this.field936) {
               int var2 = super.field157.method504();
               int var3 = super.field157.method595();
               float var4 = (float)var2 - (float)(-var3 + var2) * 0.125F;
               float var5 = (float)var2 + -((float)(-var3 + var2) * 0.25F);
               OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field157.field8416, (float)super.field157.field8497 / 255.0F);
               super.field157.method4112((byte)-78, 1);
               super.field157.method4160(super.field157.field8452, 2);
               super.field157.method4112((byte)-66, 0);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field942[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method688(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method689(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
