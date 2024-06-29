import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class627 {
   @OriginalMember(
      owner = "client!via",
      name = "d",
      descriptor = "Lqq;"
   )
   private class82 field9251 = new class82();
   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9264 = new String[]{method4642(method4641("&\u007fSOYx")), method4642(method4641("&\u007fSOVx")), method4642(method4641("&\u007fSOUx")), method4642(method4641("+8\u001cOm")), method4642(method4641(">c^\r")), method4642(method4641("&\u007fSOWx")), method4642(method4641("&\u007fSOZx")), method4642(method4641("&\u007fSOSx")), method4642(method4641("&\u007fSOXx")), method4642(method4641("&\u007fSOTx")), method4642(method4641("&\u007fSO,9x[\u0015.x")), method4642(method4641("&\u007fSOQx")), method4642(method4641("&\u007fSORx"))};
   @OriginalMember(
      owner = "client!via",
      name = "c",
      descriptor = "I"
   )
   public static int field9254 = 503;
   @OriginalMember(
      owner = "client!via",
      name = "o",
      descriptor = "I"
   )
   public static int field9249;
   @OriginalMember(
      owner = "client!via",
      name = "i",
      descriptor = "I"
   )
   public static int field9250;
   @OriginalMember(
      owner = "client!via",
      name = "l",
      descriptor = "I"
   )
   public static int field9252;
   @OriginalMember(
      owner = "client!via",
      name = "e",
      descriptor = "I"
   )
   public static int field9253;
   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "I"
   )
   public static int field9255;
   @OriginalMember(
      owner = "client!via",
      name = "h",
      descriptor = "I"
   )
   public static int field9256;
   @OriginalMember(
      owner = "client!via",
      name = "g",
      descriptor = "I"
   )
   public static int field9257;
   @OriginalMember(
      owner = "client!via",
      name = "m",
      descriptor = "I"
   )
   public static int field9258;
   @OriginalMember(
      owner = "client!via",
      name = "j",
      descriptor = "I"
   )
   public static int field9259;
   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "I"
   )
   public static int field9261;
   @OriginalMember(
      owner = "client!via",
      name = "f",
      descriptor = "I"
   )
   public static int field9262;
   @OriginalMember(
      owner = "client!via",
      name = "n",
      descriptor = "I"
   )
   public static int field9263;
   @OriginalMember(
      owner = "client!via",
      name = "k",
      descriptor = "Lqq;"
   )
   private class82 field9260;

   @OriginalMember(
      owner = "client!via",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method4631(byte arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 >= -96) {
            field9254 = 2;
         }

         ++field9261;

         while(true) {
            class82 var3 = this.field9251.field1157;
            if (this.field9251 != var3) {
               var3.method797((byte)115);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field9260 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9264[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method4632(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field9258;
         if (arg0 > -75) {
            field9254 = 25;
         }

         int var3 = 0;
         class82 var4 = this.field9251.field1157;
         if (var2) {
            ++var3;
            var4 = var4.field1157;
         }

         while(true) {
            if (this.field9251 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field1157;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9264[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(I)Lqq;"
   )
   public final class82 method4633(int arg0) {
      try {
         ++field9259;
         class82 var2 = this.field9251.field1157;
         if (this.field9251 == var2) {
            return null;
         } else {
            int var3 = -96 % ((8 - arg0) / 58);
            var2.method797((byte)126);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9264[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4634(int arg0) {
      try {
         if (arg0 != 503) {
            method4638(-118, 3, (class706)null, 14, true, (byte)57, (class339)null);
         }

         ++field9252;
         return this.field9251.field1157 == this.field9251;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9264[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method4635(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != -81) {
            field9254 = 15;
         }

         ++field9256;
         return false;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9264[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(B)Lqq;"
   )
   public final class82 method4636(byte arg0) {
      try {
         ++field9263;
         class82 var2 = this.field9260;
         if (arg0 < 16) {
            return null;
         } else if (this.field9251 == var2) {
            this.field9260 = null;
            return null;
         } else {
            this.field9260 = var2.field1157;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9264[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(Lqq;B)V"
   )
   public final void method4637(class82 arg0, byte arg1) {
      try {
         if (arg0.field1154 != null) {
            arg0.method797((byte)109);
         }

         ++field9253;
         arg0.field1154 = this.field9251.field1154;
         arg0.field1157 = this.field9251;
         arg0.field1154.field1157 = arg0;
         arg0.field1157.field1154 = arg0;
         if (arg1 <= 85) {
            field9262 = 116;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9264[2] + (arg0 != null ? field9264[3] : field9264[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IILst;IZBLww;)V"
   )
   public static final void method4638(int arg0, int arg1, class706 arg2, int arg3, boolean arg4, byte arg5, class339 arg6) {
      try {
         class380.method3011(arg4, arg1, arg3, arg0, arg6, (byte)-118);
         if (arg5 != 72) {
            field9262 = 36;
         }

         ++field9257;
         class176.field2274 = arg2;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9264[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9264[3] : field9264[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9264[3] : field9264[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "d",
      descriptor = "(I)Lqq;"
   )
   public final class82 method4639(int arg0) {
      try {
         if (arg0 > -61) {
            method4635((byte)82, -33, -82);
         }

         ++field9250;
         class82 var2 = this.field9251.field1157;
         if (this.field9251 == var2) {
            this.field9260 = null;
            return null;
         } else {
            this.field9260 = var2.field1157;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9264[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "c",
      descriptor = "(I)Lqq;"
   )
   public final class82 method4640(int arg0) {
      try {
         if (arg0 != 503) {
            this.method4631((byte)-105);
         }

         ++field9249;
         class82 var2 = this.field9251.field1154;
         if (this.field9251 == var2) {
            this.field9260 = null;
            return null;
         } else {
            this.field9260 = var2.field1154;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9264[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "<init>",
      descriptor = "()V"
   )
   public class627() {
      try {
         this.field9251.field1154 = this.field9251;
         this.field9251.field1157 = this.field9251;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9264[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4641(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4642(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
