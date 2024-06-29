import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class433 extends class316 {
   @OriginalMember(
      owner = "client!mha",
      name = "n",
      descriptor = "Z"
   )
   private boolean field6259 = false;
   @OriginalMember(
      owner = "client!mha",
      name = "f",
      descriptor = "Z"
   )
   private boolean field6267 = false;
   @OriginalMember(
      owner = "client!mha",
      name = "c",
      descriptor = "Ltaa;"
   )
   private class426 field6260;
   @OriginalMember(
      owner = "client!mha",
      name = "o",
      descriptor = "Lud;"
   )
   private class39 field6261;
   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6271 = new String[]{method3262(method3261("I\"\u0015#[|1\u0004'Bd6\u00161U_")), method3262(method3261("_9\u001d'")), method3262(method3261("F8\u0011ly\u0003")), method3262(method3261("X3\u0011.U")), method3262(method3261("\\1\u0006'uS \u001f,UE$")), method3262(method3261("\\1\u0006'yE$\u0015,CB$\t")), method3262(method3261("I\"\u0015#[|1\u0004'Bo5\u00006X")), method3262(method3261("P~^lM")), method3262(method3261("E%\u001c.")), method3262(method3261("F8\u0011l\fB>\u00196\u000e\u0003")), method3262(method3261("]1\u0002;YE7P4UHcP5F}5\u00026USkz4QY)\u0019,W\u000b6\u001c-Q_p\u0007#DN\"4'@_8KHEE9\u0016-BFp\u0006'S\u0018p\u00037^o9\u0002y:^>\u0019$_Y=P4UHdP1EE\u0013\u001f._^\"KHEE9\u0016-BFp\u0016._J$P1EE\u0015\b2_E5\u001e6\u000b!%\u001e+VD\"\u001dbFN3BbGJ&\u0015\u000b^_5\u001e1Y_)KHEE9\u0016-BFp\u0016._J$P5Q]55:@D>\u0015,D\u0010Z\u0005,YM?\u0002/\u0010M<\u001f#D\u000b2\u0002'Q@\u0007\u00116UY\u0014\u00152DCkz7^B6\u001f0]\u000b6\u001c-Q_p\u00120UJ;'#DN\"?$VX5\u0004y:^>\u0019$_Y=P1QF \u001c'B\u0018\u0014P,_Y=\u0011.cJ=\u0000.UYkz7^B6\u001f0]\u000b#\u0011/@G5\u0002\u0001EI5P'^]\u001d\u00112cJ=\u0000.UYkz4_B4P/QB>Xk\u0010PZ\u0006'S\u001fp\u0007,~D\"\u001d#\\\u000bmP6US$\u00050U\u0018\u0014X,_Y=\u0011.cJ=\u0000.UY|P%\\t\u0004\u0015:sD?\u0002&k\u001b\r^:IQy^0RL1KHGE\u001e\u001f0]J<^:IQpMb\u0002\u0005`Z5^e?\u0002/QG~\b;J\u0006a^r\u000b!&\u0015!\u0003\u000b'\u001e\u0014UH$\u001f0\u0010\u0016p\u001e-BF1\u001c+JNx\u00074fN\"\u0004'H\u0002kz4UHcP5^y5\u0016.UH$\u0019-^\u000bmP0UM<\u0015!D\u0003'\u001e\u0014UH$\u001f0\u001c\u000b'\u001e\f_Y=\u0011.\u001eS)\nk\u000b!&\u0015!\u0003\u000b5\u001e4sD<\u001f7B\u000bmP6US$\u00050Uh%\u0012'\u0018N>\u0006\u000fQ[\u0003\u0011/@G5\u0002n\u0010\\>\"'VG5\u00136YD>YlBL2KHFN3DbC[5\u00137\\J\"3-\\D%\u0002b\r\u000b#\u0005,sD<\u001f7B\u0001 \u001f5\u0018H<\u0011/@\u0003}\u0014-D\u0003#\u0005,tB\"\\bGE\u0002\u0015$\\N3\u0004+_Ey\\b\u0000\u0005`\\b\u0001\u0005`Yn\u0010X%\u001e\u0007H[?\u001e'^_yKHVG?\u00116\u0010X8\u001f0Um1\u00136_YpMbSG1\u001d2\u0018\\1\u0004'Bo5\u00006X\u00042\u0002'Q@\u0007\u00116UY\u0014\u00152DC}\u00120UJ;'#DN\"?$VX5\u0004hGE\u001e\u001f0]J<^5\u001c\u000b`^r\u001c\u000ba^r\u0019\u0010Z\u0016._J$P5Q]56#S_?\u0002b\r\u000b \u001f5\u0018\u001a~@oCC?\u0002'vJ3\u0004-B\u0007p\u0007#FN\u0015\b2_E5\u001e6\u0019\u0006`^w\u000b!'\u00114Um1\u00136_YpMb\u001d\u001f~@hGJ&\u0015\u0004QH$\u001f0\u001a\\1\u0006'vJ3\u0004-B\u0000a^r\u000b!6\u001c-Q_p\u001e&__5P\u007f\u0010O?\u0004jGE\u0006\u0015!DD\"\\bGE\u001e\u001f0]J<^:IQyKHVG?\u00116\u0010M\"\u00151^N<P\u007f\u0010[?\u0007j\u0001\u0005`]#RXx\u001e&__5Yn\u0010\u001a~@k\u000b!&\u0015!\u0004\u000b#\u00050VJ3\u0015\u0001_G?\u00050\u0010\u0016p\u001d+H\u0003&\u0015!\u0004\u00035\u001e4sD<\u001f7B\u0007p\u00160UX>\u0015.\u001aX8\u001f0Um1\u00136_Yy\\b\u0018\\1\u0006'yE$\u0015,CB$\tlH\u0001'\u001e\f_Y=\u0011.\u001e\\'\u00075\u0019\u0000'\u00114Ub>\u0004'^X9\u0004;\u001eR|P5Q]56#S_?\u0002k\u001bX \u0015!EG1\u0002\u0001_G?\u00050\u001aX8\u001f0Um1\u00136_Ykz%\\t\u0016\u0002#Wh?\u001c-B\u000bmP4UHdX/YSx\u00037BM1\u0013'sD<\u001f7B\u0005\"\u0017 \u001c\u000b7\u001c\u001dvD7^!_G?\u0002lBL2\\bWG\u000f6-Wm\"\u0011%sD?\u0002&\u0019\u0007p\u00037BM1\u0013'sD<\u001f7B\u00051Yy:VZ")), method3262(method3261("^>\u0019$_Y=P$\\D1\u0004bDB=\u0015y:^>\u0019$_Y=P$\\D1\u0004bCH1\u001c'\u000b!&\u00110IB>\u0017bFN3CbG]\u0006\u00150DN(KHFJ\"\t+^Lp\u0016._J$P5Q_5\u0002\u0006U[$\u0018y:]?\u0019&\u0010F1\u0019,\u0018\u0002p\u000bHGJ$\u00150tN \u0004*\u0010\u0016p\u0017.of%\u001c6Y\u007f5\b\u0001_D\"\u0014r\u001eQkz4UHdP'S}5\u00026USpMbWG\u000f=-TN<&+U\\\u001d\u00116BB(Z%\\t\u0006\u00150DN(KHG]\u0006\u00150DN(^:\u0010\u0016p\u0014-D\u00037\u001c\u001d~D\"\u001d#\\f1\u00040YS\u000b@\u001f\u001c\u000b5\u0013\u0014UY$\u0015:\u001eS)\nk\u000b!'\u0006\u0014UY$\u0015:\u001eRpMbTD$X%\\t\u001e\u001f0]J<=#DY9\b\u0019\u0001v|P'S}5\u00026US~\b;J\u0002kz5F}5\u00026US~\nb\r\u000b4\u001f6\u0018L</\f_Y=\u0011.}J$\u0002+Hpb-n\u0010N3&'B_5\blHR*Yy:L</\u0016US\u0013\u001f-BO\u000b@\u001f\u001eSpMbTD$X%\\t\u0004\u0015:D^\"\u0015\u000fQ_\"\u0019:k\u001b\r+rm\u0007p\u0017.of%\u001c6Y\u007f5\b\u0001_D\"\u0014r\u0019\u0001#\u0013#\\Nkz%\\t\u0004\u0015:sD?\u0002&k\u001b\r^;\u0010\u0016p\u0014-D\u00037\u001c\u001ddN(\u00047BN\u001d\u00116BB(+rmpa-n\u0010L</\u000fEG$\u0019\u0016US\u0013\u001f-BO`YhCH1\u001c'\u000b!7\u001c\u001ddN(3-_Y4+rm\u0005*P\u007f\u0010_9\u001d'\u000b!7\u001c\u001ddN(3-_Y4+rm\u0005'P\u007f\u0010\u001a~@y:L</\u0004_L\u0016\u0002#Wh?\u001f0T\u000bmPs\u001e\u001b}\u0013.QF XjWG\u000f6-W\u00055\u001e&\u001bN3&'B_5\blJ\u0002z\u0017.om?\u0017lCH1\u001c'\u001c\u000b`^r\u001c\u000ba^r\u0019\u0010Z\u0017.o{?\u0003+DB?\u001eb\r\u000b6\u00040QE#\u0016-BFxYy:VZ")), method3262(method3261("E?\u0002/QG\u0003\u0011/@G5\u0002")), method3262(method3261("N>\u0006\u000fQ[\u0003\u0011/@G5\u0002")), method3262(method3261("X%\u001e\u0007H[?\u001e'^_")), method3262(method3261("F8\u0011lq\u0003")), method3262(method3261("X%\u001e\u0006YY")), method3262(method3261("X%\u001e\u0001_G?\u00050")), method3262(method3261("F8\u0011lt\u0003")), method3262(method3261("F8\u0011lr\u0003")), method3262(method3261("F8\u0011lw\u0003")), method3262(method3261("F8\u0011lx\u0003")), method3262(method3261("F8\u0011lu\u0003")), method3262(method3261("F8\u0011ls\u0003")), method3262(method3261("F8\u0011lv\u0003"))};
   @OriginalMember(
      owner = "client!mha",
      name = "e",
      descriptor = "I"
   )
   public static int field6265 = 0;
   @OriginalMember(
      owner = "client!mha",
      name = "m",
      descriptor = "I"
   )
   public static int field6257;
   @OriginalMember(
      owner = "client!mha",
      name = "i",
      descriptor = "I"
   )
   public static int field6262;
   @OriginalMember(
      owner = "client!mha",
      name = "p",
      descriptor = "I"
   )
   public static int field6263;
   @OriginalMember(
      owner = "client!mha",
      name = "l",
      descriptor = "I"
   )
   public static int field6264;
   @OriginalMember(
      owner = "client!mha",
      name = "k",
      descriptor = "I"
   )
   public static int field6266;
   @OriginalMember(
      owner = "client!mha",
      name = "j",
      descriptor = "I"
   )
   public static int field6268;
   @OriginalMember(
      owner = "client!mha",
      name = "g",
      descriptor = "I"
   )
   public static int field6269;
   @OriginalMember(
      owner = "client!mha",
      name = "h",
      descriptor = "I"
   )
   public static int field6270;
   @OriginalMember(
      owner = "client!mha",
      name = "d",
      descriptor = "Lhw;"
   )
   public static class141 field6258;

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(BI)V",
      line = 3
   )
   public static final void method3258(byte arg0, int arg1) {
      try {
         ++field6266;
         if (arg0 != -56) {
            field6265 = 70;
         }

         class536 var2 = class108.method1038((long)arg1, arg0 ^ -93, 8);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6271[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public final void method805(int arg0) {
      try {
         if (this.field6267) {
            super.field4567.method259(32, 1);
            super.field4567.method252((class707)null, (byte)-69);
            super.field4567.method259(32, 0);
            super.field4567.method252((class707)null, (byte)-86);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6267 = false;
         }

         ++field6268;
         int var2 = -14 / ((arg0 - -18) / 63);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6271[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(BZ)V",
      line = 38
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         ++field6270;
         class14 var3 = super.field4567.method350(0);
         if (this.field6259 && var3 != null) {
            float var4 = 1.0F + 2.0F * (1.0F - Math.abs(super.field4567.field830[1]));
            super.field4567.method259(32, 1);
            super.field4567.method252(var3, (byte)-68);
            super.field4567.method259(32, 0);
            super.field4567.method252(this.field6260.field6177, (byte)-88);
            long var5 = this.field6261.field935;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field6271[12]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field6271[13]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field6271[16]), -super.field4567.field830[0], -super.field4567.field830[1], -super.field4567.field830[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field6271[17]), super.field4567.field858 * var4, super.field4567.field780 * var4, super.field4567.field856 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field6271[14]), 64.0F + Math.abs(super.field4567.field830[1]) * 928.0F);
            this.field6267 = true;
         }

         int var7 = -123 % ((arg0 - -44) / 38);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6271[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "<init>",
      descriptor = "(Lrk;Ltaa;)V",
      line = 70
   )
   public class433(class35 arg0, class426 arg1) {
      super(arg0);

      try {
         this.field6260 = arg1;
         if (this.field6260.field6177 != null && super.field4567.field869 && super.field4567.field837) {
            class366 var3 = class383.method2979(super.field4567, 12203, 35633, field6271[11]);
            class366 var4 = class383.method2979(super.field4567, 12203, 35632, field6271[10]);
            this.field6261 = class105.method1020(new class366[]{var3, var4}, super.field4567, (byte)120);
            this.field6259 = this.field6261 != null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6271[9] + (arg0 != null ? field6271[7] : field6271[8]) + ',' + (arg1 != null ? field6271[7] : field6271[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(I)Z",
      line = 92
   )
   public final boolean method807(int arg0) {
      try {
         if (arg0 != -18913) {
            this.method806((byte)59, false);
         }

         ++field6269;
         return this.field6259;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6271[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(IILufa;)V",
      line = 103
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         if (!this.field6267) {
            super.field4567.method252(arg2, (byte)-97);
            super.field4567.method322(-121, arg1);
         }

         ++field6262;
         if (arg0 != 0) {
            this.method805(73);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6271[22] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6271[7] : field6271[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(BZ)V",
      line = 121
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         ++field6263;
         if (arg0 != 51) {
            field6265 = 65;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6271[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(III)V",
      line = 134
   )
   public final void method810(int arg0, int arg1, int arg2) {
      try {
         ++field6264;
         if (arg2 != 0) {
            this.method807(44);
         }

         if (this.field6267) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float)(1 << ((61 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float)(3 & arg1 >> 16) / 8.0F;
            float var8 = (float)((arg1 & 8032076) >> 19) / 16.0F;
            float var9 = (float)((arg1 & 133741856) >> 23) / 16.0F;
            int var10 = arg1 >> 27 & 15;
            long var11 = this.field6261.field935;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6271[1]), (float)(super.field4567.field728 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6271[3]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6271[6]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6271[0]), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field6271[5]), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6271[4]), (float)var10);
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field6271[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(II)Z",
      line = 171
   )
   public static final boolean method3259(int arg0, int arg1) {
      try {
         ++field6257;
         if (arg1 != 47 && arg1 != 59 && ~arg1 != -24 && ~arg1 != -18 && ~arg1 != -21) {
            if (~arg1 != -9 && ~arg1 != -1007) {
               return arg0 != -18 ? false : false;
            } else {
               return true;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6271[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(B)V",
      line = 198
   )
   public static void method3260(byte arg0) {
      try {
         if (arg0 != 70) {
            field6258 = null;
         }

         field6258 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6271[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3261(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3262(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
