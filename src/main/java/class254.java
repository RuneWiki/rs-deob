import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class254 {
   @OriginalMember(
      owner = "client!aaa",
      name = "j",
      descriptor = "Lsia;"
   )
   private class407 field3203 = new class407(64);
   @OriginalMember(
      owner = "client!aaa",
      name = "h",
      descriptor = "Lww;"
   )
   private class339 field3206;
   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3211 = new String[]{method2050(method2049("V\u0001?##\u001f")), method2050(method2049("@\u0017)")), method2050(method2049("V\u0001?#\"\u001f")), method2050(method2049("_\u0014*}Z\u0018O")), method2050(method2049("@\u0017) \u0017C\u00177}")), method2050(method2049("\u0019\u00031`O[]")), method2050(method2049("\u0018\u0010c")), method2050(method2049("@\u0017) \u0017C\u0012=")), method2050(method2049("@\u0017) \u0017C\u0011?")), method2050(method2049("\u0018\u0001c")), method2050(method2049("V\u0001?#&\u001f")), method2050(method2049("Y\u00152a")), method2050(method2049("V\u0001?#\\^\u000e7y^\u001f")), method2050(method2049("LNp#\u001d")), method2050(method2049("V\u0001?#*\u001f")), method2050(method2049("V\u0001?#$\u001f")), method2050(method2049("V\u0001?#!\u001f")), method2050(method2049("V\u0001?#'\u001f")), method2050(method2049("V\u0001?#(\u001f")), method2050(method2049("V\u0001?#%\u001f"))};
   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "Lsia;"
   )
   public static class407 field3204 = new class407(4);
   @OriginalMember(
      owner = "client!aaa",
      name = "e",
      descriptor = "I"
   )
   public static int field3207 = 0;
   @OriginalMember(
      owner = "client!aaa",
      name = "c",
      descriptor = "I"
   )
   public static int field3198;
   @OriginalMember(
      owner = "client!aaa",
      name = "i",
      descriptor = "I"
   )
   public static int field3199;
   @OriginalMember(
      owner = "client!aaa",
      name = "l",
      descriptor = "I"
   )
   public static int field3200;
   @OriginalMember(
      owner = "client!aaa",
      name = "k",
      descriptor = "I"
   )
   public static int field3201;
   @OriginalMember(
      owner = "client!aaa",
      name = "m",
      descriptor = "I"
   )
   public static int field3202;
   @OriginalMember(
      owner = "client!aaa",
      name = "g",
      descriptor = "I"
   )
   public static int field3205;
   @OriginalMember(
      owner = "client!aaa",
      name = "f",
      descriptor = "I"
   )
   public static int field3208;
   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "I"
   )
   public static int field3209;
   @OriginalMember(
      owner = "client!aaa",
      name = "d",
      descriptor = "I"
   )
   public static int field3210;

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(III)Lbq;"
   )
   public static final class731 method2039(int arg0, int arg1, int arg2) {
      if (class548.field8080[arg0][arg1][arg2] == null) {
         boolean var3 = class548.field8080[0][arg1][arg2] != null && class548.field8080[0][arg1][arg2].field10646 != null;
         if (var3 && arg0 >= class174.field2251 - 1) {
            return null;
         }

         class383.method3036(arg0, arg1, arg2);
      }

      return class548.field8080[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(IZJLjava/lang/String;IZZBIILjava/lang/String;IJ)V"
   )
   public static final void method2040(int arg0, boolean arg1, long arg2, String arg3, int arg4, boolean arg5, boolean arg6, byte arg7, int arg8, int arg9, String arg10, int arg11, long arg12) {
      try {
         ++field3205;
         if (!class652.field9742 && class455.field6279 < 500) {
            int var18 = arg9 == -1 ? class436.field5949 : arg9;
            if (arg7 > -21) {
               method2043(36);
            }

            class541 var15 = new class541(arg10, arg3, var18, arg0, arg8, arg2, arg11, arg4, arg1, arg5, arg12, arg6);
            class455.method3486(var15, 0);
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field3211[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3211[13] : field3211[11]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field3211[13] : field3211[11]) + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2041(int arg0) {
      try {
         if (arg0 < 88) {
            method2042((byte)121);
         }

         ++field3199;
         if (class366.field5092.field10745 && class267.field3378.field11035 != -1) {
            class552.method4179(-3616, class267.field3378.field11035, class267.field3378.field11029);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3211[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2042(byte arg0) {
      try {
         field3204 = null;
         if (arg0 < 7) {
            field3204 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3211[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2043(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(II)Ldw;"
   )
   public final class590 method2044(int arg0, int arg1) {
      try {
         ++field3209;
         class407 var3 = this.field3203;
         class590 var4;
         synchronized(this.field3203) {
            var4 = (class590)this.field3203.method3192((long)arg1, (byte)-110);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field3206;
            byte[] var6;
            synchronized(this.field3206) {
               var6 = this.field3206.method2697(arg1, arg0, false);
            }

            class590 var7 = new class590();
            if (var6 != null) {
               var7.method4391(-23, new class66(var6));
            }

            class407 var8 = this.field3203;
            synchronized(this.field3203) {
               this.field3203.method3190(var7, (long)arg1, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3211[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2045(int arg0, int arg1) {
      try {
         if (arg1 >= -19) {
            method2039(-88, -45, -14);
         }

         ++field3201;
         class407 var3 = this.field3203;
         synchronized(this.field3203) {
            this.field3203.method3197(5, arg0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3211[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "c",
      descriptor = "(B)Ljava/lang/String;"
   )
   public static final String method2046(byte arg0) {
      boolean var1 = client.field1481;

      try {
         String var2;
         label33: {
            ++field3210;
            var2 = field3211[1];
            if (class625.field9242 != class583.field8611) {
               if (class776.field11304 == class583.field8611) {
                  var2 = field3211[8];
                  if (!var1) {
                     break label33;
                  }
               }

               if (class583.field8611 != class267.field3376) {
                  break label33;
               }

               var2 = field3211[4];
               if (!var1) {
                  break label33;
               }
            }

            var2 = field3211[7];
         }

         String var3 = "";
         if (arg0 != 76) {
            method2046((byte)-62);
         }

         if (class452.field6244 != null) {
            var3 = field3211[6] + class452.field6244;
         }

         return field3211[3] + var2 + "." + class688.field10127.field6964 + field3211[5] + class782.field11389 + field3211[9] + class311.field4331 + var3 + "/";
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3211[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2047(int arg0) {
      try {
         class407 var2 = this.field3203;
         synchronized(this.field3203) {
            this.field3203.method3187(-23825);
         }

         int var3 = -106 % ((arg0 - 4) / 63);
         ++field3198;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3211[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2048(byte arg0) {
      try {
         ++field3202;
         if (arg0 == -47) {
            class407 var2 = this.field3203;
            synchronized(this.field3203) {
               this.field3203.method3201((byte)-75);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3211[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class254(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field3206 = arg2;
         this.field3206.method2691(31, 10);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3211[12] + (arg0 != null ? field3211[13] : field3211[11]) + ',' + arg1 + ',' + (arg2 != null ? field3211[13] : field3211[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2049(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2050(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
