import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class238 extends class757 {
   @OriginalMember(
      owner = "client!jda",
      name = "q",
      descriptor = "Z"
   )
   private boolean field2947 = false;
   @OriginalMember(
      owner = "client!jda",
      name = "l",
      descriptor = "Lgg;"
   )
   private class186 field2958;
   @OriginalMember(
      owner = "client!jda",
      name = "p",
      descriptor = "Lgg;"
   )
   private class186 field2946;
   @OriginalMember(
      owner = "client!jda",
      name = "y",
      descriptor = "Lgg;"
   )
   private class186 field2945;
   @OriginalMember(
      owner = "client!jda",
      name = "i",
      descriptor = "Lgg;"
   )
   private class186 field2956;
   @OriginalMember(
      owner = "client!jda",
      name = "e",
      descriptor = "Lmj;"
   )
   private class684 field2953;
   @OriginalMember(
      owner = "client!jda",
      name = "v",
      descriptor = "Z"
   )
   private boolean field2941;
   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2962 = new String[]{method1788(method1787("P%T\u0000\u007f\u0012")), method1788(method1787("T4YB")), method1788(method1787("Ao\u001b\u0000C")), method1788(method1787("P%T\u0000y\u0012")), method1788(method1787("P%T\u0000x\u0012")), method1788(method1787("P%T\u0000{\u0012")), method1788(method1787("P%T\u0000|\u0012")), method1788(method1787("P%T\u0000z\u0012")), method1788(method1787("P%T\u0000w\u0012")), method1788(method1787("P%T\u0000t\u0012")), method1788(method1787("P%T\u0000\u0002S/\\Z\u0000\u0012")), method1788(method1787("\u001b`t||L1\u0004\u0000\u000e0\u0000azls\u0003\u0015\u000eWj.F\u000e\u001e\u001aa\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u00141Z]WN(Z@\u00050\u0000azls\u0003\u0015\u000eWt.GC_Va\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u0014/Z\\S[-\u000e$\u007fn\u0015gg|\u001aa\\mQV.@\\\u001e\u001aa\u0015\u000e\u001e\u0007aCKLN$M\u0000]U-Z\\\u00050\u0000azls\u0003\u0015\u000eWn$MmQU3Q\u000e\u001e\u001aa\b\u000eH_3AKF\u00145PV]U.GJe\n\u001c\u000e$qo\u0015e{j\u001aaZ~QIa\u0015\u000e\u001e\u001aa\u0015\u000e\u001e\u0007aGKMO-A\u0000NU2\\ZWU/\u000e$qo\u0015e{j\u001aaZmQV.@\\\u001e\u001aa\u0015\u000e\u001e\u0007aGKMO-A\u0000]U-Z\\\u00050\u000e`zno\u0015\u0015\u000eQn$MmQU3Q\u001e\u001e\u001aa\b\u000eL_2@BJ\u00145PV]U.GJe\n\u001c\u000e$qo\u0015e{j\u001aaZz[B\u0002ZAL^p\u0015\u000e\u001e\u0007aGKMO-A\u0000J_9VAQH%n\u001fc\u0001Kz{jj\u0014a\u000e\u001eU\u0007ZI}U.GJ\u001e\u001aa\u0015\u0013\u001eH$F[RNoSAYY.Z\\Z\u0001Keol{\f\u0015\u000e\u001e\\.R~_H X]\u001e\u001aa\u0015\u0013\u001eJ3ZIL[,\u001bBQY Yu\u000egz?~\u007fh\u0000x\u000e\u001e\u001a6TZ[H\u0011YOP_a\u0015\u000e\u0003\u001a1GAYH X\u0000RU\"TBe\u000b\u001c\u000e$n{\u0013tc\u001e\u001aaEc_N3\\Ve\u000e\u001c\u0015\u000e\u001e\u0007aN\u000eMN AK\u0010W A\\WBoE\\QP$VZWU/\u0015S\u00050\u0011t|\u007fwa\u0015\u000eSL\fTZLS9n\u001ac\u001aa\b\u000eE\u001a2AOJ_oXOJH(M\u0000SU%PBHS$B\u000eC\u0001Keol{\f\u0015\u000e\u001eN$Mc_N3\\Ve\u000e\u001c\u0015\u0013\u001eAaFZ_N$\u001bC_N3\\V\u0010N$MZKH$n\u001ec\u001a<\u000e$j\u007f\fe\u000e\u001e\u001aaCG[M\u0011Z]\u0012\u001a7\\KIt.GC_Vm\u0015HQ]\u0007TMJU3\u0019\u000eZ_1AF\u0012\u001a\"ZBQO3\u0019\u000eP^.AB\u00050\u0005e\u001a\u001e\u001aaCG[M\u0011Z]\u0010Bm\u0015CHw A\\WB\u001a\u0005s\u0012\u001a(eAM\u0001Kq~\n\u001aa\u0015XW_6eAM\u00148\u0019\u000eSL\fTZLS9n\u001fc\u0016a\\~QIz?jn\u000ea\u0015\u000eHS$B~QIoO\u0002\u001eW7xOJH(Mu\fgm\u0015GnU2\u000e$zju\u0015\u000e\u001eL(PYnU2\u001bY\u0012\u001a,Cc_N3\\Ve\t\u001c\u0019\u000eWj.F\u00154i\u0014w\u000e\u001e\u001a'ZIx[\"AAL\u00149\u0019\u000e\u0013L(PYnU2\u001bT\u0012\u001a'ZIn[3TCM\u00149\u000e$so\r\u0015\u000e\u001e\\.Rh_Y5Z\\\u0010Bm\u0015HQ]\u0007TMJU3\u001bV\u0012\u001aq\u001b\u001e\u000e\u000bx\u0000\u001d\u000f\bt\u000e$zju\u0015\u000e\u001e^$EZV\u0016aBOJ_3eB_T$\u0019\u000eHS$B~QIz?c\u007f~a\u0015\u000eXU&sO]N.G\u0000G\u0016a\u0018J[J5]\u0002\u001e\\.R~_H X]\u0010@m\u0015HQ]\u0011T\\_W2\u001bY\u00050\u0012`l\u001e\u001aaSAY| VZQHoO\u0002\u001e\u00177\\KIj.F\u0000D\u0016aSAYj GOSIoL\u00154w\u0014y\u000e\u001e\u001a'ZIx[\"AAL\u0014;\u0019\u000eXU&sO]N.G\u0000D\u0016a\u0005\u0000\u000e\nr\f\u001e\b\bt\u000e$ss\u000f\u0015\u000e\u001e\\.Rh_Y5Z\\\u0012\u001a'ZIx[\"AAL\u0016a\u0004\u00154w\u0000m\u000e\u001e\u001a'ZIx[\"AAL\u0016aSAY| VZQHm\u0015\u001e\u00050\f`b\u001e\u001aaSAY| VZQHoO\u0002\u001e\\.Rh_Y5Z\\\u0010@m\u0015\u0003Z_1AF\u00050\ftj\u001e\u001aaCG[M\u0011Z]\u0010B8O\u0002\u001eM AKLj-T@[\u00149LTI\u0016aSAY| VZQHoOTD@m\u0015XW_6eAM\u00149LTI\u0001Kxof\u001aa\u0015Aj_9vAQH%\u0004\u0000FC;\u0019\u000eXU&sO]N.G\u0000FB9M\u0002\u001e\\.Rh_Y5Z\\\u0010C8LW\u00050\fzx\u001e\u001aaZz[B\u0002ZAL^p\u001bY\u0012\u001ap\u000e$zjr\u0015\u000e\u001eL(PYpU3XOR\u00149\u0019\u000eSL\fTZLS9n\u001ec\u0016a\\`QH,TB\u00050\u0005e\u001d\u001e\u001aaCG[M\u000fZ\\S[-\u001bW\u0012\u001a,Cc_N3\\Ve\u000b\u001c\u0019\u000eWt.GC_Vz?jn\ta\u0015\u000eHS$B`QH,TB\u0010@m\u0015CHw A\\WB\u001a\u0007s\u0012\u001a({ALW Y\u00154~\u0011\u0006\u000e\u001e\u001a/QAJVoM\u0002\u001eL(PYpU3XOR\u0016aFZ_N$\u001bBW])Au\u000egoEAMS5\\AP\u0001Kq~\r\u001aa\u0015@ZU5Y\u0000G\u0016aCG[M\u000fZ\\S[-\u0019\u000eMN AK\u0010V(RFJaph\u0000NU2\\ZWU/\u000e$s{\u0019\u0015\u000e\u001eT%ZZR\u0016a[JQN-\u0019\u000e\u000e\u0001Kxah\u001aa\u0015MQV.@\\\u0012\u001a2AOJ_oYGYR5XAZ_-\u001bOSX(P@J\u0001Kxoz\u001aa\u0015MQV.@\\\u0012\u001a2AOJ_oYGYR5n\u001ec\u0014%\\HXO2P\u0002\u001eT%ZZR\u00149MVF\u0016aVARU4G\u00154w\u0000q\u000e\u001e\u001a\"ZBQO3\u0019\u000eMN AK\u0010V(RFJaph\u0000ZS'S[M_m\u0015@ZU5Y\u0000GC8L\u0002\u001eY.YAKHz?ckva\u0015\u000eQy.YAKHm\u0015G}U-Z[L\u0016aVARU4G\u00154~\u0011\u0001\u000e\u001e\u001a.eAM\u00149\u0019\u000eNw A\\WB\u001a\u0005s\u0012\u001a7\\KIj.F\u00154~\u0011\u0001\u000e\u001e\u001a.eAM\u00148\u0019\u000eNw A\\WB\u001a\u0004s\u0012\u001a7\\KIj.F\u00154~\u0011\u0001\u000e\u001e\u001a.eAM\u0014;\u0019\u000eNw A\\WB\u001a\u0007s\u0012\u001a7\\KIj.F\u00154~\u0011\u0001\u000e\u001e\u001a.eAM\u00146\u0019\u000eNw A\\WB\u001a\u0006s\u0012\u001a7\\KIj.F\u00154w\u000ec\u000e\u001e\u001a.sAYy.Z\\Z\u00149\u0019\u000eHS$B~QIoO\u00154~\u0011\u0001\u000e\u001e\u001a.aKFy.Z\\Z\noM\u0002\u001eN$Mc_N3\\Ve\n\u001c\u0019\u000eWn$MmQU3Q\u00154~\u0011\u0001\u000e\u001e\u001a.aKFy.Z\\Z\noL\u0002\u001eN$Mc_N3\\Ve\u000b\u001c\u0019\u000eWn$MmQU3Q\u00154~\u0011\u0001\u000e\u001e\u001a.aKFy.Z\\Z\noO\u0002\u001eN$Mc_N3\\Ve\b\u001c\u0019\u000eWn$MmQU3Q\u00154w\u000ec\u000e\u001e\u001a.aKFy.Z\\Z\noB\u0002\u001e\u000bz?kp~K")), method1788(method1787("\u001b`t||L1\u0004\u0000\u000e0\u0000azls\u0003\u0015\u000eWj.F\u000e\u001e\u001aa\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u00141Z]WN(Z@\u00050\u0000azls\u0003\u0015\u000eWt.GC_Va\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u0014/Z\\S[-\u000e$\u007fn\u0015gg|\u001aa\\mQV.@\\\u001e\u001aa\u0015\u000e\u001e\u0007aCKLN$M\u0000]U-Z\\\u00050\u0000azls\u0003\u0015\u000eWn$MmQU3Q\u000e\u001e\u001aa\b\u000eH_3AKF\u00145PV]U.GJe\n\u001c\u000e$qo\u0015e{j\u001aaZ~QIa\u0015\u000e\u001e\u001aa\u0015\u000e\u001e\u0007aGKMO-A\u0000NU2\\ZWU/\u000e$qo\u0015e{j\u001aaZmQV.@\\\u001e\u001aa\u0015\u000e\u001e\u0007aGKMO-A\u0000]U-Z\\\u00050\u000e`zno\u0015\u0015\u000eQn$MmQU3Q\u001e\u001e\u001aa\b\u000eL_2@BJ\u00145PV]U.GJe\n\u001c\u000e$qo\u0015e{j\u001aaZz[B\u0002ZAL^p\u0015\u000e\u001e\u0007aGKMO-A\u0000J_9VAQH%n\u001fc\u0001Kz{jj\u0014a\u000e\u001eU\u0007ZI}U.GJ\u001e\u001aa\u0015\u0013\u001eH$F[RNoSAYY.Z\\Z\u0001Keol{\f\u0015\u000e\u001e\\.R~_H X]\u001e\u001aa\u0015\u0013\u001eJ3ZIL[,\u001bBQY Yu\u000egz?~\u007fh\u0000x\u000e\u001e\u001a6TZ[H\u0011YOP_a\u0015\u000e\u0003\u001a1GAYH X\u0000RU\"TBe\u000b\u001c\u000e$n{\u0013tc\u001e\u001aaAc_N3\\Ve\u000e\u001c\u0015\u000e\u001e\u0007aN\u000eMN AK\u0010W A\\WBoAKFN4GKe\n\u001c\u0015S\u00050\u0011t|\u007fwa\u0015\u000eNw A\\WB\u001a\u0001s\u001e\u001aa\b\u000eE\u001a2AOJ_oXOJH(M\u0000NH._K]N(Z@\u001eGz?~\u007fh\u0000x\u000e\u001e\u001a,Cc_N3\\Ve\u000e\u001c\u0015\u000e\u0003\u001a:\u0015]J[5P\u0000S[5GGF\u0014,ZJ[V7\\KI\u001a<\u000e$j\u007f\fe\u000e\u001e\u001aaCG[M\u0011Z]\u0012\u001a7\\KIt.GC_Vm\u0015HQ]\u0007TMJU3\u0019\u000e]U-Z[L\u0016a[JQN-\u000e$zju\u0015\u000e\u001eL(PYnU2\u001bV\u0012\u001a,Cc_N3\\Ve\n\u001c\u0019\u000eWj.F\u00154~\u0011\u0001\u000e\u001e\u001a7\\KIj.F\u0000G\u0016aXXs[5GGFaph\u0002\u001eS\u0011Z]\u00050\u0005e\u001a\u001e\u001aaCG[M\u0011Z]\u0010@m\u0015CHw A\\WB\u001a\u0007s\u0012\u001a(eAM\u0001Kq~\n\u001aa\u0015XW_6eAM\u00146\u0019\u000eSL\fTZLS9n\u001dc\u0016a\\~QIz?}kxa\u0015\u000eXU&sO]N.G\u0000F\u0016a\u0018XW_6eAM\u0014;\u0019\u000eXU&eOL[,F\u0000F\u0001Kx{r\u001aa\u0015HQ]\u0007TMJU3\u001bV\u0012\u001a'ZIx[\"AAL\u00149\u0019\u000e\u000e\u0014q\u0005\u001f\u0007\u000fr\u0004\u001c\u000b\u0001Kxoz\u001aa\u0015HQ]\u0007TMJU3\u001bW\u0012\u001a(aKFy.Z\\Z\u0014;\u0019\u000eXU&eOL[,F\u0000D\u0016aSAYj GOSIoB\u00154i\u0014w\u000e\u001e\u001a'ZIx[\"AAL\u0014;\u0019\u000e\u0013L(PYnU2\u001bT\u0012\u001a'ZIn[3TCM\u00148\u000e$so\r\u0015\u000e\u001e\\.Rh_Y5Z\\\u0010@m\u0015HQ]\u0007TMJU3\u001bT\u0012\u001aq\u001b\u001e\u000e\tx\u0005\u0018\f\u000fz?ckva\u0015\u000eXU&sO]N.G\u0000F\u0016aSAY| VZQHoM\u0002\u001e\\.Rh_Y5Z\\\u0010Cz?cwta\u0015\u000eXU&sO]N.G\u0002\u001e\\.Rh_Y5Z\\\u0012\u001ap\u000e$s{\u0019\u0015\u000e\u001e\\.Rh_Y5Z\\\u0012\u001a'ZIx[\"AAL\u0016a\u0005\u00154w\u0014y\u000e\u001e\u001a'ZIx[\"AAL\u0014;\u0019\u000eXU&sO]N.G\u0000D\u0016a\\z[B\u0002ZAL^oO\u00154w\u0000q\u000e\u001e\u001a7\\KIj.F\u0000FC;\u0019\u000eI[5P\\nV [K\u0010B8OY\u0012\u001a'ZIx[\"AAL\u0014;OTD\u0016aCG[M\u0011Z]\u0010B8OY\u00050\ftv\u001e\u001aaZz[B\u0002ZAL^p\u001bVG@m\u0015HQ]\u0007TMJU3\u001bVFB9\u0019\u000eXU&sO]N.G\u0000GC8L\u00154w\u000ec\u000e\u001e\u001a.aKFy.Z\\Z\u000boB\u0002\u001e\u000bz?jn\ta\u0015\u000eHS$B`QH,TB\u0010Bm\u0015CHw A\\WB\u001a\u0005s\u0012\u001a({ALW Y\u00154~\u0011\u0006\u000e\u001e\u001a7\\KIt.GC_VoL\u0002\u001eW7xOJH(Mu\u000fgm\u0015GpU3XOR\u0001Kq~\r\u001aa\u0015XW_6{ALW Y\u0000D\u0016aXXs[5GGFash\u0002\u001eS\u000fZ\\S[-\u000e$zjr\u0015\u000e\u001eT%ZZR\u00149\u0019\u000eHS$B`QH,TB\u0012\u001a2AOJ_oYGYR5n\u001ec\u00141Z]WN(Z@\u00050\u0005e\u001d\u001e\u001aa[JQN-\u001bW\u0012\u001a7\\KIt.GC_Vm\u0015]J[5P\u0000RS&]Ze\u000b\u001c\u001b^QI(AGQTz?c\u007fba\u0015\u000eP^.AB\u0012\u001a/QAJVm\u0015\u001e\u00050\fzx\u001e\u001aaVARU4G\u0002\u001eI5TZ[\u0014-\\IVN,ZJ[VoTC\\S$[Z\u00050\ftj\u001e\u001aaVARU4G\u0002\u001eI5TZ[\u0014-\\IVN\u001a\u0005s\u0010^(SHKI$\u0019\u000eP^.AB\u0010B9MV\u0012\u001a\"ZBQO3\u000e$s{\u0005\u0015\u000e\u001eY.YAKHm\u0015]J[5P\u0000RS&]Ze\u000b\u001c\u001bJW\\'@][\u0016a[JQN-\u001bWGC8\u0019\u000e]U-Z[L\u0001Kx{r\u001aa\u0015A}U-Z[L\u0016a\\mQV.@\\\u0012\u001a\"ZBQO3\u000e$zju\u0015\u000e\u001eU\u0011Z]\u0010Bm\u0015^s[5GGFaqh\u0002\u001eL(PYnU2\u000e$zju\u0015\u000e\u001eU\u0011Z]\u0010Cm\u0015^s[5GGFaph\u0002\u001eL(PYnU2\u000e$zju\u0015\u000e\u001eU\u0011Z]\u0010@m\u0015^s[5GGFash\u0002\u001eL(PYnU2\u000e$zju\u0015\u000e\u001eU\u0011Z]\u0010Mm\u0015^s[5GGFarh\u0002\u001eL(PYnU2\u000e$su\u0017\u0015\u000e\u001eU\u0007ZI}U.GJ\u0010Bm\u0015XW_6eAM\u0014;\u000e$zjr\u0015\u000e\u001eU\u0015PV}U.GJ\u000e\u00149\u0019\u000eJw A\\WB\u001a\u0005s\u0012\u001a(aKFy.Z\\Z\u0001Kq~\r\u001aa\u0015Aj_9vAQH%\u0005\u0000G\u0016aAc_N3\\Ve\u000b\u001c\u0019\u000eWn$MmQU3Q\u00154w\u000ec\u000e\u001e\u001a.aKFy.Z\\Z\noOY\u0012\u001a(aKFy.Z\\Z\u0001Kp`z0")), method1788(method1787("\u001b`t||L1\u0004\u0000\u000e0\u0000azls\u0003\u0015\u000eWj.F\u000e\u001e\u001aa\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u00141Z]WN(Z@\u00050\u0000azls\u0003\u0015\u000eWy.YAKHa\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u0014\"ZBQHz?ojn\u0013|l\u001e\u001a(aKFy.Z\\Z\u001aa\u0015\u000e\u0003\u001a7P\\J_9\u001bZ[B\"ZAL^\u001a\u0005s\u00050\u000e`zno\u0015\u0015\u000eQj.F\u000e\u001e\u001aa\u0015\u000e\u001e\u001aa\b\u000eL_2@BJ\u00141Z]WN(Z@\u00050\u000e`zno\u0015\u0015\u000eQy.YAKHa\u0015\u000e\u001e\u001aa\b\u000eL_2@BJ\u0014\"ZBQHz?akn\u0011`z\u001e\u001a.aKFy.Z\\Z\na\u0015\u000e\u0003\u001a3P]KV5\u001bZ[B\"ZAL^\u001a\u0005s\u00050\u000e`zno\u0015\u0015\u000eQn$MmQU3Q\u001f\u001e\u001aa\b\u000eL_2@BJ\u00145PV]U.GJe\u000b\u001c\u000e$qo\u0015e{j\u001aaZhQ]\u0002ZAL^a\u0015\u000e\u001e\u0007aGKMO-A\u0000XU&VAQH%\u000e$n{\u0013tc\u001e\u001aaSAYj GOSIa\u0015\u000e\u001e\u0007aE\\Q]3TC\u0010V.VORaqh\u00154j\u0000gos\u001aa\u0015Y_N$G~R[/P\u000e\u001e\u001a|\u0015^LU&GOS\u0014-ZM_V\u001a\u0004s\u00050\u0011t|\u007fwa\u0015\u000eJw A\\WB\u001a\u0001s\u001e\u001aa\b\u000eE\u001a2AOJ_oXOJH(M\u0000J_9A[L_\u001a\u0005s\u001eGz?~\u007fh\u0000x\u000e\u001e\u001a1xOJH(Mu\nga\u0015\u000e\u0003\u001a:\u0015]J[5P\u0000S[5GGF\u00141GAT_\"AGQTaH\u00154j\u0000gos\u001aa\u0015CHw A\\WB\u001a\u0001s\u001e\u001a|\u0015U\u001eI5TZ[\u0014,TZLS9\u001bCQ^$YXW_6\u0015S\u00050\u0015pcn\u001aa\u0015\u000eHS$B~QIm\u0015HQ]\u0007TMJU3\u000e$zju\u0015\u000e\u001eL(PYnU2\u001bV\u0012\u001a,Cc_N3\\Ve\n\u001c\u0019\u000eWj.F\u00154~\u0011\u0001\u000e\u001e\u001a7\\KIj.F\u0000G\u0016aXXs[5GGFaph\u0002\u001eS\u0011Z]\u00050\u0005e\u001a\u001e\u001aaCG[M\u0011Z]\u0010@m\u0015CHw A\\WB\u001a\u0007s\u0012\u001a(eAM\u0001Kq~\n\u001aa\u0015XW_6eAM\u00146\u0019\u000eSL\fTZLS9n\u001dc\u0016a\\~QIz?}kxa\u0015\u000eXU&sO]N.G\u0000F\u0016a\u0018XW_6eAM\u0014;\u0019\u000eXU&eOL[,F\u0000F\u0001Kx{r\u001aa\u0015HQ]\u0007TMJU3\u001bV\u0012\u001a'ZIx[\"AAL\u00149\u0019\u000e\u000e\u0014q\u0005\u001f\u0007\u000fr\u0004\u001c\u000b\u0001Kxoz\u001aa\u0015HQ]\u0007TMJU3\u001bW\u0012\u001a(aKFy.Z\\Z\u0014;\u0019\u000eXU&eOL[,F\u0000D\u0016aSAYj GOSIoB\u00154i\u0014w\u000e\u001e\u001a'ZIx[\"AAL\u0014;\u0019\u000e\u0013L(PYnU2\u001bT\u0012\u001a'ZIn[3TCM\u00148\u000e$so\r\u0015\u000e\u001e\\.Rh_Y5Z\\\u0010@m\u0015HQ]\u0007TMJU3\u001bT\u0012\u001aq\u001b\u001e\u000e\tx\u0005\u0018\f\u000fz?ckva\u0015\u000eXU&sO]N.G\u0000F\u0016aSAY| VZQHoM\u0002\u001e\\.Rh_Y5Z\\\u0010Cz?cwta\u0015\u000eXU&sO]N.G\u0002\u001e\\.Rh_Y5Z\\\u0012\u001ap\u000e$s{\u0019\u0015\u000e\u001e\\.Rh_Y5Z\\\u0012\u001a'ZIx[\"AAL\u0016a\u0005\u00154w\u0014y\u000e\u001e\u001a'ZIx[\"AAL\u0014;\u0019\u000eXU&sO]N.G\u0000D\u0016a\\z[B\u0002ZAL^oO\u00154w\u0000q\u000e\u001e\u001a7\\KIj.F\u0000FC;\u0019\u000eI[5P\\nV [K\u0010B8OY\u0012\u001a'ZIx[\"AAL\u0014;OTD\u0016aCG[M\u0011Z]\u0010B8OY\u00050\ftv\u001e\u001aaZz[B\u0002ZAL^p\u001bVG@m\u0015HQ]\u0007TMJU3\u001bVFB9\u0019\u000eXU&sO]N.G\u0000GC8L\u00154w\u000ec\u000e\u001e\u001a.aKFy.Z\\Z\u000boB\u0002\u001e\u000bz?cqla\u0015\u000eQy.YAKHm\u0015G}U-Z[L\u0001Kq~\n\u001aa\u0015AnU2\u001bV\u0012\u001a1xOJH(Mu\u000egm\u0015XW_6eAM\u0001Kq~\n\u001aa\u0015AnU2\u001bW\u0012\u001a1xOJH(Mu\u000fgm\u0015XW_6eAM\u0001Kq~\n\u001aa\u0015AnU2\u001bT\u0012\u001a1xOJH(Mu\fgm\u0015XW_6eAM\u0001Kq~\n\u001aa\u0015AnU2\u001bY\u0012\u001a1xOJH(Mu\rgm\u0015XW_6eAM\u0001Kxah\u001aa\u0015AxU&vAQH%\u001bV\u0012\u001a7\\KIj.F\u0000D\u0001Kq~\r\u001aa\u0015Aj_9vAQH%\u0005\u0000F\u0016aAc_N3\\Ve\n\u001c\u0019\u000eWn$MmQU3Q\u00154~\u0011\u0006\u000e\u001e\u001a.aKFy.Z\\Z\noL\u0002\u001eN\fTZLS9n\u001fc\u0016a\\z[B\u0002ZAL^z?cqla\u0015\u000eQn$MmQU3Q\u001e\u0010@6\u0019\u000eWn$MmQU3Q\u00154\u007f\u000fq$")), method1788(method1787("\u001b`t||L1\u0004\u0000\u000e0\u0000azls\u0003\u0015\u000eWj.F\u000e\u001e\u001aa\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u00141Z]WN(Z@\u00050\u0000azls\u0003\u0015\u000eWy.YAKHa\u0015\u000e\u001e\u001aa\b\u000eH_3AKF\u0014\"ZBQHz?ojn\u0013|l\u001e\u001a(aKFy.Z\\Z\u001aa\u0015\u000e\u0003\u001a7P\\J_9\u001bZ[B\"ZAL^\u001a\u0005s\u00050\u000e`zno\u0015\u0015\u000eQj.F\u000e\u001e\u001aa\u0015\u000e\u001e\u001aa\b\u000eL_2@BJ\u00141Z]WN(Z@\u00050\u000e`zno\u0015\u0015\u000eQy.YAKHa\u0015\u000e\u001e\u001aa\b\u000eL_2@BJ\u0014\"ZBQHz?akn\u0011`z\u001e\u001a.aKFy.Z\\Z\na\u0015\u000e\u0003\u001a3P]KV5\u001bZ[B\"ZAL^\u001a\u0005s\u00050\u000e`zno\u0015\u0015\u000eQn$MmQU3Q\u001f\u001e\u001aa\b\u000eL_2@BJ\u00145PV]U.GJe\u000b\u001c\u000e$qo\u0015e{j\u001aaZhQ]\u0002ZAL^a\u0015\u000e\u001e\u0007aGKMO-A\u0000XU&VAQH%\u000e$n{\u0013tc\u001e\u001aaSAYj GOSIa\u0015\u000e\u001e\u0007aE\\Q]3TC\u0010V.VORaqh\u00154j\u0000gos\u001aa\u0015Y_N$G~R[/P\u000e\u001e\u001a|\u0015^LU&GOS\u0014-ZM_V\u001a\u0004s\u00050\u0011t|\u007fwa\u0015\u000eNw A\\WB\u001a\u0001s\u001e\u001aa\b\u000eE\u001a2AOJ_oXOJH(M\u0000NH._K]N(Z@\u001eGz?~\u007fh\u0000x\u000e\u001e\u001a,Cc_N3\\Ve\u000e\u001c\u0015\u000e\u0003\u001a:\u0015]J[5P\u0000S[5GGF\u0014,ZJ[V7\\KI\u001a<\u000e$n{\u0013tc\u001e\u001aaAKFw A\\WB\u001a\u0001s\u001e\u0007aN\u000eMN AK\u0010W A\\WBoAKFN4GKe\n\u001c\u0015S\u00050\u0015pcn\u001aa\u0015\u000eHS$B~QIm\u0015HQ]\u0007TMJU3\u0019\u000eZ_1AF\u00050\u0005e\u001a\u001e\u001aaCG[M\u0011Z]\u0010Bm\u0015CHw A\\WB\u001a\u0005s\u0012\u001a(eAM\u0001Kq~\n\u001aa\u0015XW_6eAM\u00148\u0019\u000eSL\fTZLS9n\u001fc\u0016a\\~QIz?jn\u000ea\u0015\u000eHS$B~QIoO\u0002\u001eW7xOJH(Mu\fgm\u0015GnU2\u000e$zju\u0015\u000e\u001eL(PYnU2\u001bY\u0012\u001a,Cc_N3\\Ve\t\u001c\u0019\u000eWj.F\u00154i\u0014w\u000e\u001e\u001a'ZIx[\"AAL\u00149\u0019\u000e\u0013L(PYnU2\u001bT\u0012\u001a'ZIn[3TCM\u00149\u000e$so\r\u0015\u000e\u001e\\.Rh_Y5Z\\\u0010Bm\u0015HQ]\u0007TMJU3\u001bV\u0012\u001aq\u001b\u001e\u000e\u000bx\u0000\u001d\u000f\bt\u000e$zju\u0015\u000e\u001e^$EZV\u0016aBOJ_3eB_T$\u0019\u000eHS$B~QIz?c\u007f~a\u0015\u000eXU&sO]N.G\u0000G\u0016a\u0018J[J5]\u0002\u001e\\.R~_H X]\u0010@m\u0015HQ]\u0011T\\_W2\u001bY\u00050\u0012`l\u001e\u001aaSAY| VZQHoO\u0002\u001e\u00177\\KIj.F\u0000D\u0016aSAYj GOSIoL\u00154w\u0014y\u000e\u001e\u001a'ZIx[\"AAL\u0014;\u0019\u000eXU&sO]N.G\u0000D\u0016a\u0005\u0000\u000e\nr\f\u001e\b\bt\u000e$ss\u000f\u0015\u000e\u001e\\.Rh_Y5Z\\\u0012\u001a'ZIx[\"AAL\u0016a\u0004\u00154w\u0000m\u000e\u001e\u001a'ZIx[\"AAL\u0016aSAY| VZQHm\u0015\u001e\u00050\f`b\u001e\u001aaSAY| VZQHoO\u0002\u001e\\.Rh_Y5Z\\\u0010@m\u0015\u0003Z_1AF\u00050\ftj\u001e\u001aaCG[M\u0011Z]\u0010B8O\u0002\u001eM AKLj-T@[\u00149LTI\u0016aSAY| VZQHoOTD@m\u0015XW_6eAM\u00149LTI\u0001Kxof\u001aa\u0015Aj_9vAQH%\u0004\u0000FC;\u0019\u000eXU&sO]N.G\u0000FB9M\u0002\u001e\\.Rh_Y5Z\\\u0010C8LW\u00050\fzx\u001e\u001aaZz[B\u0002ZAL^p\u001bY\u0012\u001ap\u000e$su\u0017\u0015\u000e\u001eU\u0002ZBQO3\u0019\u000eWy.YAKHz?jn\u000ea\u0015\u000eQj.F\u0000F\u0016aEc_N3\\Ve\n\u001c\u0019\u000eHS$B~QIz?jn\u000ea\u0015\u000eQj.F\u0000G\u0016aEc_N3\\Ve\u000b\u001c\u0019\u000eHS$B~QIz?jn\u000ea\u0015\u000eQj.F\u0000D\u0016aEc_N3\\Ve\b\u001c\u0019\u000eHS$B~QIz?jn\u000ea\u0015\u000eQj.F\u0000I\u0016aEc_N3\\Ve\t\u001c\u0019\u000eHS$B~QIz?cqla\u0015\u000eQ|.RmQU3Q\u0000F\u0016aCG[M\u0011Z]\u0010@z?jn\u000ea\u0015\u000eQn$MmQU3Q\u001e\u0010Bm\u0015Z[B\fTZLS9n\u001ec\u0016a\\z[B\u0002ZAL^z?jn\u000ea\u0015\u000eQn$MmQU3Q\u001e\u0010Cm\u0015Z[B\fTZLS9n\u001fc\u0016a\\z[B\u0002ZAL^z?jn\u000ea\u0015\u000eQn$MmQU3Q\u001e\u0010@m\u0015Z[B\fTZLS9n\u001cc\u0016a\\z[B\u0002ZAL^z?cqla\u0015\u000eQn$MmQU3Q\u001e\u0010Mm\u0015\u001f\u00050\u0004{j4")), method1788(method1787("P%T\u0000}\u0012")), method1788(method1787("P%T\u0000v\u0012"))};
   @OriginalMember(
      owner = "client!jda",
      name = "r",
      descriptor = "Lbga;"
   )
   public static class378 field2951 = new class378(10, -1);
   @OriginalMember(
      owner = "client!jda",
      name = "g",
      descriptor = "Lbga;"
   )
   public static class378 field2955 = new class378(141, 4);
   @OriginalMember(
      owner = "client!jda",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field2960 = false;
   @OriginalMember(
      owner = "client!jda",
      name = "k",
      descriptor = "I"
   )
   public static int field2942;
   @OriginalMember(
      owner = "client!jda",
      name = "u",
      descriptor = "I"
   )
   public static int field2943;
   @OriginalMember(
      owner = "client!jda",
      name = "h",
      descriptor = "I"
   )
   public static int field2948;
   @OriginalMember(
      owner = "client!jda",
      name = "t",
      descriptor = "I"
   )
   public static int field2949;
   @OriginalMember(
      owner = "client!jda",
      name = "j",
      descriptor = "I"
   )
   public static int field2950;
   @OriginalMember(
      owner = "client!jda",
      name = "o",
      descriptor = "I"
   )
   public static int field2952;
   @OriginalMember(
      owner = "client!jda",
      name = "x",
      descriptor = "I"
   )
   public static int field2957;
   @OriginalMember(
      owner = "client!jda",
      name = "n",
      descriptor = "I"
   )
   public static int field2959;
   @OriginalMember(
      owner = "client!jda",
      name = "s",
      descriptor = "I"
   )
   public static int field2961;
   @OriginalMember(
      owner = "client!jda",
      name = "w",
      descriptor = "Z"
   )
   private boolean field2944;
   @OriginalMember(
      owner = "client!jda",
      name = "f",
      descriptor = "Z"
   )
   private boolean field2954;

   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         if (arg0 < 110) {
            return false;
         } else {
            ++field2942;
            return this.field2941;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2962[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         if (arg1 == 500) {
            ++field2943;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2962[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method1783(boolean arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field2948;
         if (arg1) {
            if (~class366.field5168 != 0) {
               class415.method3142(-107, class366.field5168);
            }

            int var10000;
            label74: {
               class588 var3 = (class588)class202.field2476.method1850(0);
               if (var2) {
                  var10000 = var3.method3610(536870911);
               } else if (var3 == null) {
                  class366.field5168 = -1;
                  class202.field2476 = new class245(8);
                  class369.method2850(6015);
                  class366.field5168 = class709.field10352;
                  class698.method5074(7878, false);
                  class570.method4093(-30624);
                  var10000 = class366.field5168;
                  if (!var2) {
                     break label74;
                  }
               } else {
                  var10000 = var3.method3610(536870911);
               }

               label73:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class588)class202.field2476.method1850(0);
                        if (var3 == null) {
                           if (!var2) {
                              class366.field5168 = -1;
                              class202.field2476 = new class245(8);
                              class369.method2850(6015);
                              class366.field5168 = class709.field10352;
                              class698.method5074(7878, false);
                              class570.method4093(-30624);
                              var10000 = class366.field5168;
                              break;
                           }

                           class181.method1386(false, true, true, var3);
                           var3 = (class588)class202.field2476.method1847(127);
                        } else {
                           class181.method1386(false, true, true, var3);
                           var3 = (class588)class202.field2476.method1847(127);
                        }
                     } else {
                        class181.method1386(false, true, true, var3);
                        var3 = (class588)class202.field2476.method1847(127);
                     }

                     if (var3 == null) {
                        class366.field5168 = -1;
                        class202.field2476 = new class245(8);
                        class369.method2850(6015);
                        class366.field5168 = class709.field10352;
                        class698.method5074(7878, false);
                        class570.method4093(-30624);
                        var10000 = class366.field5168;
                        if (!var2) {
                           break label73;
                        }
                     } else {
                        var10000 = var3.method3610(536870911);
                     }
                  }
               } while(var2);
            }

            class16.method134(var10000);
         }

         class676.method4953(-119);
         class552.field7593 = false;
         class458.method3370(!arg0);
         class325.field4354 = -1;
         if (arg0) {
            label41: {
               class727.method5288(45, class696.field10167);
               class278.field3709 = new class404();
               class278.field3709.field1003 = class215.field2667 * 512 / 2;
               class278.field3709.field999 = class507.field7030 * 512 / 2;
               class278.field3709.field7853[0] = class507.field7030 / 2;
               class278.field3709.field7855[0] = class215.field2667 / 2;
               class532.field7284 = 0;
               class737.field10747 = 0;
               if (~class635.field8977 != -3) {
                  class263.method2025((byte)-88);
                  if (!var2) {
                     break label41;
                  }
               }

               class532.field7284 = class772.field11146 << 9;
               class737.field10747 = class27.field338 << 9;
            }

            class300.method2261(15966);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2962[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         ++field2949;
         this.field2944 = arg1;
         super.field10974.method4841(1, 33984);
         super.field10974.method4848(false, this.field2953);
         super.field10974.method4862(7681, 34165, 56);
         super.field10974.method4901(768, 0, 34166, 5);
         super.field10974.method4901(770, 2, 5890, 5);
         super.field10974.method4906((byte)26, 770, 0, 34168);
         super.field10974.method4841(0, 33984);
         this.method1785((byte)-116);
         if (arg0 <= 24) {
            this.field2954 = false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2962[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1784(int arg0) {
      try {
         field2955 = null;
         field2951 = null;
         if (arg0 != -17268) {
            field2955 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2962[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         ++field2961;
         if (this.field2954) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2954 = false;
         }

         super.field10974.method4841(1, 33984);
         int var2 = 23 / ((48 - arg0) / 63);
         super.field10974.method4848(false, (class573)null);
         super.field10974.method4862(8448, 8448, 46);
         super.field10974.method4901(768, 0, 5890, 5);
         super.field10974.method4901(770, 2, 34166, 5);
         super.field10974.method4906((byte)26, 770, 0, 5890);
         super.field10974.method4841(0, 33984);
         if (this.field2947) {
            super.field10974.method4901(768, 0, 5890, 5);
            super.field10974.method4906((byte)26, 770, 0, 5890);
            this.field2947 = false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2962[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class238(class670 arg0) {
      super(arg0);

      try {
         if (super.field10974.field9761) {
            this.field2958 = class124.method1041(34336, -47, super.field10974, field2962[13]);
            this.field2946 = class124.method1041(34336, -68, super.field10974, field2962[12]);
            this.field2945 = class124.method1041(34336, -95, super.field10974, field2962[14]);
            this.field2956 = class124.method1041(34336, -55, super.field10974, field2962[11]);
            if (this.field2956 != null & this.field2958 != null & this.field2946 != null & this.field2945 != null) {
               this.field2953 = new class684(arg0, 3553, 6406, 2, 1, false, new byte[]{0, -1}, 6406, false);
               this.field2953.method4998(10497, false, false);
               this.field2941 = true;
            } else {
               this.field2941 = false;
            }
         } else {
            this.field2941 = false;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2962[10] + (arg0 != null ? field2962[2] : field2962[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1785(byte arg0) {
      try {
         ++field2950;
         if (arg0 <= -58) {
            class528 var2;
            label35: {
               var2 = super.field10974.field9745;
               if (this.field2944) {
                  OpenGL.glBindProgramARB(34336, super.field10974.field9766 != Integer.MAX_VALUE ? this.field2956.field2283 : this.field2946.field2283);
                  if (!client.field4273) {
                     break label35;
                  }
               }

               OpenGL.glBindProgramARB(34336, super.field10974.field9766 != Integer.MAX_VALUE ? this.field2945.field2283 : this.field2958.field2283);
            }

            var2.method3807(0.0F, 81, 0.0F, (float)super.field10974.field9766, class643.field9033, -1.0F);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class643.field9033[0], class643.field9033[1], class643.field9033[2], class643.field9033[3]);
            OpenGL.glEnable(34336);
            this.field2954 = true;
            this.method1786(-2591);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2962[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -118) {
            this.method385(false, -99);
         }

         ++field2957;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2962[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         if (arg0 == -96) {
            ++field2959;
            if (arg2 == null) {
               if (!this.field2947) {
                  super.field10974.method4848(false, super.field10974.field9800);
                  super.field10974.method4879(0, 1);
                  super.field10974.method4901(768, 0, 34168, arg0 ^ -91);
                  super.field10974.method4906((byte)26, 770, 0, 34168);
                  this.field2947 = true;
                  return;
               }
            } else {
               if (this.field2947) {
                  super.field10974.method4901(768, 0, 5890, 5);
                  super.field10974.method4906((byte)26, 770, 0, 5890);
                  this.field2947 = false;
               }

               super.field10974.method4848(false, arg2);
               super.field10974.method4879(arg0 + 96, arg1);
            }

         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2962[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2962[2] : field2962[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1786(int arg0) {
      try {
         if (arg0 != -2591) {
            this.method385(true, 100);
         }

         ++field2952;
         if (this.field2954) {
            int var2 = super.field10974.method578();
            int var3 = super.field10974.method567();
            float var4 = (float)var2 - (float)(-var3 + var2) * 0.125F;
            float var5 = (float)var2 + -((float)(-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field10974.field9774, (float)super.field10974.field9780 / 255.0F);
            super.field10974.method4841(1, 33984);
            super.field10974.method4876(arg0 ^ 2686, super.field10974.field9787);
            super.field10974.method4841(0, 33984);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2962[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1787(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1788(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
