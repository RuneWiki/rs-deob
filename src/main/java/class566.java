import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class566 extends class141 {
   @OriginalMember(
      owner = "client!vi",
      name = "n",
      descriptor = "Lwi;"
   )
   private class494 field8067;
   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "Laq;"
   )
   private class172 field8078;
   @OriginalMember(
      owner = "client!vi",
      name = "o",
      descriptor = "Lpk;"
   )
   private class211 field8065;
   @OriginalMember(
      owner = "client!vi",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8080 = new String[]{method4037(method4036("\u0014\u001e;a/")), method4037(method4036("\u0014\u001e;f/")), method4037(method4036("OZ+\u0000")), method4037(method4036("\u0014\u001e;d/")), method4037(method4036("\u0014\u001e;c/")), method4037(method4036("\u0014\u001e;b/")), method4037(method4036("\f\u0002yL")), method4037(method4036("\u0019Y;\u000ez")), method4037(method4036("\u0014\u001e;h/")), method4037(method4036("\u0014\u001e;j/")), method4037(method4036("\u0014\u001e;i/")), method4037(method4036("\u0014\u001e;\u001cn\f\u001ea\u001e/")), method4037(method4036("\u0016\u0005tNt\u0012\u0016gEi\u0016(bAs\u0007\u0005")), method4037(method4036("\u0005\u001b")), method4037(method4036("\u0014\u001e;e/")), method4037(method4036("\u0014\u001e;g/"))};
   @OriginalMember(
      owner = "client!vi",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field8068 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @OriginalMember(
      owner = "client!vi",
      name = "B",
      descriptor = "[Leaa;"
   )
   public static class529[] field8074 = new class529[1024];
   @OriginalMember(
      owner = "client!vi",
      name = "s",
      descriptor = "Lek;"
   )
   public static class536 field8077 = new class536(41, 3);
   @OriginalMember(
      owner = "client!vi",
      name = "r",
      descriptor = "I"
   )
   public static int field8063;
   @OriginalMember(
      owner = "client!vi",
      name = "p",
      descriptor = "I"
   )
   public static int field8066;
   @OriginalMember(
      owner = "client!vi",
      name = "t",
      descriptor = "I"
   )
   public static int field8069;
   @OriginalMember(
      owner = "client!vi",
      name = "q",
      descriptor = "I"
   )
   public static int field8071;
   @OriginalMember(
      owner = "client!vi",
      name = "m",
      descriptor = "I"
   )
   public static int field8072;
   @OriginalMember(
      owner = "client!vi",
      name = "C",
      descriptor = "I"
   )
   public static int field8073;
   @OriginalMember(
      owner = "client!vi",
      name = "v",
      descriptor = "I"
   )
   public static int field8075;
   @OriginalMember(
      owner = "client!vi",
      name = "A",
      descriptor = "I"
   )
   public static int field8076;
   @OriginalMember(
      owner = "client!vi",
      name = "u",
      descriptor = "I"
   )
   public static int field8079;
   @OriginalMember(
      owner = "client!vi",
      name = "y",
      descriptor = "Ljq;"
   )
   public static class540 field8064;
   @OriginalMember(
      owner = "client!vi",
      name = "x",
      descriptor = "Lcm;"
   )
   public static class761 field8070;

   @OriginalMember(
      owner = "client!vi",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      try {
         super.field1801.method2814(0, class10.field93, true);
         ++field8075;
         OpenGL.glBindProgramARB(34336, 0);
         if (arg0 >= 102) {
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8080[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "<init>",
      descriptor = "(Lwi;Lkf;Laq;)V"
   )
   public class566(class494 arg0, class266 arg1, class172 arg2) {
      super(arg0);

      try {
         this.field8067 = arg0;
         this.field8078 = arg2;
         if (arg1 != null && this.field8078.method1401(-116) && this.field8067.field7161) {
            this.field8065 = class405.method3058(0, arg1.method2032(field8080[12], (byte)-72, field8080[13]), this.field8067, 34336);
         } else {
            this.field8065 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8080[11] + (arg0 != null ? field8080[7] : field8080[6]) + ',' + (arg1 != null ? field8080[7] : field8080[6]) + ',' + (arg2 != null ? field8080[7] : field8080[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(Lrv;I)I"
   )
   public static final int method4032(class121 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field8073;
         int var3 = arg0.field1531;
         class425 var4 = arg0.method2119(false);
         if (arg0.field3879 != arg1 && !arg0.field3791) {
            if (arg0.field3879 != var4.field6066 && arg0.field3879 != var4.field6095 && ~arg0.field3879 != ~var4.field6093 && ~arg0.field3879 != ~var4.field6060) {
               if (~arg0.field3879 != ~var4.field6069 && arg0.field3879 != var4.field6059 && arg0.field3879 != var4.field6097 && ~arg0.field3879 != ~var4.field6074) {
                  return var3;
               }

               var3 = arg0.field1526;
               if (!var2) {
                  return var3;
               }
            }

            var3 = arg0.field1525;
            if (!var2) {
               return var3;
            }
         }

         var3 = arg0.field1539;
         return var3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8080[8] + (arg0 != null ? field8080[7] : field8080[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "h",
      descriptor = "(B)V"
   )
   public static final void method4033(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "([BI)Z"
   )
   public static final boolean method4034(byte[] arg0, int arg1) {
      try {
         ++field8072;
         class147 var2 = new class147(arg0);
         if (arg1 != 11580) {
            field8068 = null;
         }

         int var3 = var2.method1143(arg1 ^ -4437);
         if (var3 != 2) {
            return false;
         } else {
            boolean var4 = ~var2.method1143(arg1 ^ -4437) == -2;
            if (var4) {
               class112.method916((byte)22, var2);
            }

            class432.method3191(var2, 101);
            return true;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8080[14] + (arg0 != null ? field8080[7] : field8080[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         if (arg2 != 0) {
            this.field8067 = null;
         }

         ++field8079;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8080[5] + (arg0 != null ? field8080[7] : field8080[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      try {
         if (!arg0) {
            return true;
         } else {
            ++field8076;
            return this.field8065 != null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8080[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         label19: {
            if (!this.field8078.field2393) {
               int var4 = super.field1801.field5301 % 4000 * 16 / 4000;
               super.field1801.method2804(this.field8078.field2397[var4], -2);
               OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
               if (!client.field4360) {
                  break label19;
               }
            }

            float var5 = (float)(super.field1801.field5301 % 4000) / 4000.0F;
            super.field1801.method2804(this.field8078.field2387, arg0 + -2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
         }

         ++field8063;
         if (arg0 != 0) {
            field8077 = null;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8080[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            method4032((class121)null, -31);
         }

         ++field8066;
         OpenGL.glBindProgramARB(34336, this.field8065.field3016);
         OpenGL.glEnable(34336);
         super.field1801.method2814(0, class706.field10312, true);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8080[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4035(int arg0) {
      try {
         field8074 = null;
         field8070 = null;
         field8068 = null;
         field8064 = null;
         if (arg0 < 45) {
            method4033((byte)-31);
         }

         field8077 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8080[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         ++field8071;
         super.field1801.method2745(-30, class603.field8872, class358.field4889);
         if (arg0) {
            this.method309(false, true);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8080[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4037(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
