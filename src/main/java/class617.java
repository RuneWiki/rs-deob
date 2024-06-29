import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class617 extends class515 {
   @OriginalMember(
      owner = "client!k",
      name = "r",
      descriptor = "Z"
   )
   private boolean field8770 = false;
   @OriginalMember(
      owner = "client!k",
      name = "n",
      descriptor = "Z"
   )
   private boolean field8768 = false;
   @OriginalMember(
      owner = "client!k",
      name = "o",
      descriptor = "Lqk;"
   )
   private class118 field8776;
   @OriginalMember(
      owner = "client!k",
      name = "m",
      descriptor = "Lpk;"
   )
   private class627 field8773;
   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8779 = new String[]{method4539(method4538("~P\u0002r")), method4539(method4538("{\u000b-6")), method4539(method4538("nPot\u0003")), method4539(method4538("~P\u0000r")), method4539(method4538("~P\br")), method4539(method4538("w\f$;\u0015B\u001f5?\fZ\u0018')\u001ba")), method4539(method4538("f\u001d 6\u001b")), method4539(method4538("~P\u0004r")), method4539(method4538("a\u0017,?")), method4539(method4538("w\f$;\u0015B\u001f5?\fQ\u001b1.\u0016")), method4539(method4538("~P\u0006r")), method4539(method4538("~P\tr")), method4539(method4538("~P\u0005r")), method4539(method4538("~P\u0007r")), method4539(method4538("`\u0010(<\u0011g\u0013a<\u0012z\u001f5z\n|\u0013$at`\u0010(<\u0011g\u0013a<\u0012z\u001f5z\rv\u001f-?E\u001f\b (\u0007|\u0010&z\bp\u001drz\tc($(\np\u0006zP\bt\f83\u0010r^'6\u0011t\na-\u001fa\u001b3\u001e\u001be\n)atc\u0011(>^x\u001f(4V<^:P\tt\n$(:p\u000e52^(^&6!X\u000b-.\u0017A\u001b9\u0019\u0011z\f%jPoEK,\u001bvJa?\u001dC\u001b3.\u001bm^|z\u0019y!\f5\u001ap\u0012\u00173\u001bb3 .\f|\u0006k=\u0012J($(\np\u0006zP\tc($(\np\u0006o\"^(^%5\n=\u0019-\u00050z\f,;\u0012X\u001f5(\u0017m%q\u0007R5\u001b\"\f\u001bg\n$\"Pm\u0007;sE\u001f\t7\f\u001bg\n$\"Pl^|z\u001az\ni=\u0012J0.(\u0013t\u0012\f;\ng\u00179\u0001OHRa?\u001dC\u001b3.\u001bmP9#\u0004<EK-\bC\u001b3.\u001bmP;zC5\u001a..Vr\u0012\u001e\u0014\u0011g\u0013 63t\n33\u0006NL\u001cv^p\u001d\u0017?\fa\u001b9t\u0006l\u0004hatr\u0012\u001e\u000e\u001bm=.5\fq%q\u0007Pm^|z\u001az\ni=\u0012J*$\"\n`\f$\u0017\u001fa\f(\"%%#\u001aj#9^&6!X\u000b-.\u0017A\u001b9\u0019\u0011z\f%jW?\r\";\u0012pEK=\u0012J*$\"=z\u00113>%%#o#^(^%5\n=\u0019-\u0005*p\u00065/\fp3 .\f|\u0006\u001aj#NO\u001cv^r\u0012\u001e\u0017\u000by\n(\u000e\u001bm=.5\fqNhp\rv\u001f-?E\u001f\u0019-\u0005*p\u0006\u00025\u0011g\u001a\u001aj#;\u0004ag^a\u0017,?E\u001f\u0019-\u0005*p\u0006\u00025\u0011g\u001a\u001aj#;\tag^$Pqatr\u0012\u001e\u001c\u0011r83;\u0019V\u0011.(\u001a5CakP%S\"6\u001fx\u000eir\u0019y!\u00075\u0019;\u001b/>Up\u001d\u0017?\fa\u001b9t\u0004<T&6!S\u0011&t\rv\u001f-?R5NojR5OojW.t&6!E\u001123\n|\u0011/zC5\u00185(\u001f{\r'5\fxVhatht")), method4539(method4538("~P}3\u0010|\n\u007fr")), method4539(method4538("c\u001f3#\u0017{\u0019a,\u001bvMa-\bC\u001b3.\u001bmEK,\u001fg\u0007(4\u00195\u0018-5\u001fa^6;\np\f\u0005?\u000ea\u0016zP\u000b{\u0017'5\fx^7?\u001d&^2/\u0010Q\u00173at`\u0010(<\u0011g\u0013a,\u001bvJa)\u000b{=.6\u0011`\fzP\u000b{\u0017'5\fx^'6\u0011t\na)\u000b{;9*\u0011{\u001b/.E\u001f\u000b/3\u0018z\f,z\u0018y\u0011 .^w\f$;\u0015B\u001f5?\fQ\u001b1.\u0016.t44\u0017s\u001137^s\u0012.;\n5\u001c3?\u001f~) .\u001bg1'<\rp\nzP\u000b{\u0017'5\fx^2;\u0013e\u0012$(MQ^/5\fx\u001f-\t\u001fx\u000e-?\f.t44\u0017s\u001137^f\u001f,*\u0012p\f\u0002/\u001cp^$4\bX\u001f1\t\u001fx\u000e-?\f.t75\u0017q^,;\u0017{Vhz\u0005\u001f\b$9J5\t/\u0014\u0011g\u0013 6^(^5?\u0006a\u000b3?MQV/5\fx\u001f-\t\u001fx\u000e-?\f9^&6!A\u001b9\u0019\u0011z\f%\u0001NHP9#\u0004<P38\u0019tEK-\u0010[\u001137\u001fyP9#\u00045CahP%T640z\f,;\u0012;\u00068 S$Pqatc\u001b\"i^b\u0010\u0017?\u001da\u00113zC5\u0010.(\u0013t\u0012( \u001b=\t7\f\u001bg\n$\"W.t7?\u001d&^64,p\u0018-?\u001da\u0017.4^(^3?\u0018y\u001b\".Vb\u0010\u0017?\u001da\u00113v^b\u0010\u000f5\fx\u001f-t\u0006l\u0004hatc\u001b\"i^p\u00107\u0019\u0011y\u00114(^(^5?\u0006a\u000b3?=`\u001c$r\u001b{\b\f;\u000eF\u001f,*\u0012p\fmz\t{,$<\u0012p\u001d53\u0011{Wo(\u0019wEK,\u001bvJa)\u000ep\u001d46\u001fg=.6\u0011`\fag^f\u000b/\u0019\u0011y\u00114(Te\u00116r\u001dy\u001f,*V8\u001a..Vf\u000b/\u001e\u0017gRa-\u0010G\u001b'6\u001bv\n(5\u0010<RajP%RakP%Wmz\r`\u0010\u0004\"\u000ez\u0010$4\n<EK<\u0012z\u001f5z\r}\u00113?8t\u001d55\f5Ca9\u0012t\u00131r\tt\n$(:p\u000e52Qw\f$;\u0015B\u001f5?\fQ\u001b1.\u00168\u001c3?\u001f~) .\u001bg1'<\rp\nk-\u0010[\u001137\u001fyP6v^%Pqv^$PqsE\u001f\u0018-5\u001fa^/>\u0011a\u001bag^q\u00115r\t{($9\nz\fmz\t{0.(\u0013t\u0012o\"\u0007oWzP\u0018y\u0011 .^s\f$)\u0010p\u0012ag^e\u00116rO;Nl;\u001cfV/>\u0011a\u001bhv^'PqsE\u001f\b$9J5\r4(\u0018t\u001d$\u0019\u0011y\u00114(^(^7?\u001d!V$4\bV\u0011-5\u000bgRa<\fp\r/?\u0012?\r)5\fp8 9\nz\fhq\re\u001b\"/\u0012t\f\u00025\u0012z\u000b3p\r}\u00113?8t\u001d55\f.t&6!S\f ==z\u0012.(^(^7?\u001d!V,3\u0006=\r4(\u0018t\u001d$\u0019\u0011y\u00114(Pg\u0019#v^r\u0012\u001e\u001c\u0011rP\"5\u0012z\fo(\u0019wRa=\u0012J8.=8g\u001f&\u0019\u0011z\f%sR5\r4(\u0018t\u001d$\u0019\u0011y\u00114(PtWzP\u0003\u001f")), method4539(method4538("~P\u0003r")), method4539(method4538("{\u001137\u001fy- 7\u000ey\u001b3")), method4539(method4538("p\u00107\u0017\u001fe- 7\u000ey\u001b3")), method4539(method4538("f\u000b/\u001e\u0017g")), method4539(method4538("f\u000b/\u0019\u0011y\u00114(")), method4539(method4538("f\u000b/\u001f\u0006e\u0011/?\u0010a"))};
   @OriginalMember(
      owner = "client!k",
      name = "q",
      descriptor = "I"
   )
   public static int field8766 = -2;
   @OriginalMember(
      owner = "client!k",
      name = "s",
      descriptor = "I"
   )
   public static int field8765;
   @OriginalMember(
      owner = "client!k",
      name = "k",
      descriptor = "I"
   )
   public static int field8767;
   @OriginalMember(
      owner = "client!k",
      name = "j",
      descriptor = "I"
   )
   public static int field8769;
   @OriginalMember(
      owner = "client!k",
      name = "l",
      descriptor = "I"
   )
   public static int field8771;
   @OriginalMember(
      owner = "client!k",
      name = "h",
      descriptor = "I"
   )
   public static int field8774;
   @OriginalMember(
      owner = "client!k",
      name = "p",
      descriptor = "I"
   )
   public static int field8775;
   @OriginalMember(
      owner = "client!k",
      name = "g",
      descriptor = "I"
   )
   public static int field8777;
   @OriginalMember(
      owner = "client!k",
      name = "f",
      descriptor = "I"
   )
   public static int field8778;
   @OriginalMember(
      owner = "client!k",
      name = "i",
      descriptor = "Lsh;"
   )
   public static class207 field8772;

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         ++field8771;
         if (arg0 != -15) {
            this.field8770 = false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8779[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         if (arg0 != 19455) {
            method4537(false);
         }

         ++field8769;
         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8779[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(IIILwaa;Lwaa;)V"
   )
   public static final void method4534(int arg0, int arg1, int arg2, class566 arg3, class566 arg4) {
      class312 var5 = class366.method2886(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field4679 = arg3;
         var5.field4690 = arg4;
         int var6 = class634.field8989 == class225.field3197 ? 1 : 0;
         if (arg3.method725(-6664)) {
            if (arg3.method723(-103)) {
               arg3.field6823 = class705.field10147[var6];
               class705.field10147[var6] = arg3;
            } else {
               arg3.field6823 = class615.field8739[var6];
               class615.field8739[var6] = arg3;
               class248.field3804 = true;
            }
         } else {
            arg3.field6823 = class399.field5912[var6];
            class399.field5912[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method725(-6664)) {
               if (arg4.method723(-34)) {
                  arg4.field6823 = class705.field10147[var6];
                  class705.field10147[var6] = arg4;
                  return;
               }

               arg4.field6823 = class615.field8739[var6];
               class615.field8739[var6] = arg4;
               class248.field3804 = true;
               return;
            }

            arg4.field6823 = class399.field5912[var6];
            class399.field5912[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!k",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4535(int arg0) {
      try {
         ++field8767;
         if (class562.field8001 != null) {
            if (arg0 != -12081) {
               method4537(true);
            }

            class562.field8001 = null;
            class91.method918(class552.field7876, class128.field2047, (byte)123, class134.field2185, class674.field9446);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8779[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         if (this.field8768) {
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, (class719)null);
            super.field7307.method4958(0, false);
            super.field7307.method4906(-2, (class719)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8768 = false;
         }

         if (arg0) {
            method4536(102, -124, 119);
         }

         ++field8774;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8779[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4536(int arg0, int arg1, int arg2) {
      try {
         ++field8778;
         int var3 = arg0 * 57 + arg2;
         int var4 = var3 ^ var3 << 13;
         if (arg1 != 3) {
            field8772 = null;
         }

         int var5 = (var4 * var4 * 15731 - -789221) * var4 + 1376312589 & Integer.MAX_VALUE;
         return (var5 & 133841498) >> 19;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8779[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         int var4 = -70 % ((arg0 - -44) / 41);
         if (!this.field8768) {
            super.field7307.method4906(-2, arg1);
            super.field7307.method4947(false, arg2);
         }

         ++field8765;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8779[3] + arg0 + ',' + (arg1 != null ? field8779[2] : field8779[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4537(boolean arg0) {
      try {
         field8772 = null;
         if (arg0) {
            field8766 = 28;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8779[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      try {
         int var4 = -22 / ((-57 - arg1) / 60);
         if (this.field8768) {
            int var5 = 1 << (3 & arg2);
            float var6 = (float)(1 << ((arg2 & 63) >> 3)) / 32.0F;
            int var7 = arg0 & 65535;
            float var8 = (float)((arg0 & 251811) >> 16) / 8.0F;
            long var9 = this.field8773.field8952;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8779[8]), (float)(super.field7307.field9679 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8779[6]), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8779[9]), (float)var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8779[5]), var8);
         }

         ++field8775;
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field8779[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         if (arg1 != 3) {
            method4535(48);
         }

         ++field8777;
         class763 var3 = super.field7307.method4895((byte)-121);
         if (this.field8770 && var3 != null) {
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, var3);
            super.field7307.method4958(0, false);
            super.field7307.method4906(-2, this.field8776.field1853);
            long var4 = this.field8773.field8952;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field8779[18]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field8779[19]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field8779[20]), -super.field7307.field9758[0], -super.field7307.field9758[1], -super.field7307.field9758[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field8779[21]), super.field7307.field9796, super.field7307.field9794, super.field7307.field9799, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field8779[22]), 96.0F + Math.abs(super.field7307.field9758[1]) * 928.0F);
            this.field8768 = true;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8779[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "<init>",
      descriptor = "(Laea;Lqk;)V"
   )
   public class617(class678 arg0, class118 arg1) {
      super(arg0);

      try {
         this.field8776 = arg1;
         if (this.field8776.field1853 != null && super.field7307.field9747 && super.field7307.field9730) {
            class631 var3 = class319.method2581(35633, field8779[14], super.field7307, -4176);
            class631 var4 = class319.method2581(35632, field8779[16], super.field7307, -4176);
            this.field8773 = class686.method4991(true, super.field7307, new class631[]{var3, var4});
            this.field8770 = this.field8773 != null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8779[15] + (arg0 != null ? field8779[2] : field8779[1]) + ',' + (arg1 != null ? field8779[2] : field8779[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4538(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4539(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
