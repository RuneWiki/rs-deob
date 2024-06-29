import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class393 {
   @OriginalMember(
      owner = "client!ob",
      name = "f",
      descriptor = "Lfm;"
   )
   public class281 field5438;
   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5444 = new String[]{method3104(method3103("s`}\u000eC")), method3104(method3103("s`}\u0000C")), method3104(method3103("rw? ")), method3104(method3103("g,}b\u0016")), method3104(method3103("s`}p\u0002rk'rC")), method3104(method3103("s`}\nC")), method3104(method3103("s`}\u0003C")), method3104(method3103("s`}\u0004C")), method3104(method3103("s`}\rC")), method3104(method3103("s`}\u0001C"))};
   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "I"
   )
   public static int field5442 = 0;
   @OriginalMember(
      owner = "client!ob",
      name = "g",
      descriptor = "I"
   )
   public static int field5435;
   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "I"
   )
   public static int field5436;
   @OriginalMember(
      owner = "client!ob",
      name = "d",
      descriptor = "I"
   )
   public static int field5437;
   @OriginalMember(
      owner = "client!ob",
      name = "h",
      descriptor = "I"
   )
   public static int field5439;
   @OriginalMember(
      owner = "client!ob",
      name = "c",
      descriptor = "I"
   )
   public static int field5440;
   @OriginalMember(
      owner = "client!ob",
      name = "i",
      descriptor = "I"
   )
   public static int field5441;
   @OriginalMember(
      owner = "client!ob",
      name = "e",
      descriptor = "I"
   )
   public static int field5443;

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(Z)Z"
   )
   public abstract boolean method1460(boolean arg0);

   @OriginalMember(
      owner = "client!ob",
      name = "d",
      descriptor = "(B)V"
   )
   public abstract void method1457(byte arg0);

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(B)V"
   )
   public void method3101(byte arg0) {
      try {
         ++field5441;
         if (arg0 != -86) {
            this.field5438 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(I)V"
   )
   public void method2738(int arg0) {
      try {
         if (arg0 != 0) {
            this.method1461((class421)null, 1, 126);
         }

         ++field5437;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "e",
      descriptor = "(B)V"
   )
   public void method2735(byte arg0) {
      try {
         if (arg0 == 117) {
            ++field5436;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public abstract void method1461(class421 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(ZB)V"
   )
   public abstract void method1459(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(Z)V"
   )
   public void method2736(boolean arg0) {
      try {
         if (arg0) {
            ++field5443;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(B)V"
   )
   public void method2317(byte arg0) {
      try {
         ++field5439;
         if (arg0 != -109) {
            field5442 = -14;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "<init>",
      descriptor = "(Lfm;)V"
   )
   public class393(class281 arg0) {
      try {
         this.field5438 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[4] + (arg0 != null ? field5444[3] : field5444[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method3102(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field5435;
         class614 var2 = (class614)class109.field1456.method288(0);
         if (var1) {
            if (!var2.field9036) {
               var2.field9038 = true;
               if (var2.field9040 >= 0 && var2.field9035 >= 0 && class273.field3491 > var2.field9040 && var2.field9035 < class211.field2689) {
                  class78.method752(var2, -97);
                  if (var1) {
                     var2.method4924(-2970);
                  }
               }
            } else {
               var2.method4924(-2970);
            }

            var2 = (class614)class109.field1456.method290(17958);
         }

         while(true) {
            while(var2 != null) {
               if (!var2.field9036) {
                  var2.field9038 = true;
                  if (var2.field9040 >= 0 && var2.field9035 >= 0 && class273.field3491 > var2.field9040 && var2.field9035 < class211.field2689) {
                     class78.method752(var2, -97);
                     if (var1) {
                        var2.method4924(-2970);
                     }
                  }
               } else {
                  var2.method4924(-2970);
               }

               var2 = (class614)class109.field1456.method290(17958);
            }

            var2 = (class614)class40.field546.method288(0);
            if (!var1) {
               byte var10000;
               if (var1) {
                  var10000 = var2.field9036;
               } else if (var2 == null) {
                  var10000 = arg0;
                  if (!var1) {
                     if (arg0 >= -65) {
                        method3102((byte)-82);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var2.field9036;
               }

               while(true) {
                  if (var10000 != 0) {
                     var2.method4924(-2970);
                     if (var1) {
                        var2.field9038 = true;
                     }
                  } else {
                     var2.field9038 = true;
                  }

                  var2 = (class614)class40.field546.method290(17958);
                  if (var2 == null) {
                     var10000 = arg0;
                     if (!var1) {
                        if (arg0 >= -65) {
                           method3102((byte)-82);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = var2.field9036;
                  }
               }
            }

            var2.method4924(-2970);
            var2 = (class614)class109.field1456.method290(17958);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5444[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(I)V"
   )
   public void method2737(int arg0) {
      try {
         ++field5440;
         if (arg0 != 0) {
            this.method2737(-61);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5444[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1462(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method1464(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3103(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3104(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
