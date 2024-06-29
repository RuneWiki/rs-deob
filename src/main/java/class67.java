import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class67 extends class454 {
   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field907 = new String[]{method671(method670(")q/\u0014X")), method671(method670(")q/\u0019X")), method671(method670(")q/\u001fX")), method671(method670(")q/\u0010X")), method671(method670(")q/\u0015X")), method671(method670(")q/\u0016X")), method671(method670(")q/\u0011X")), method671(method670(")q/\u0012X")), method671(method670(")q/\u0013X"))};
   @OriginalMember(
      owner = "client!rv",
      name = "i",
      descriptor = "I"
   )
   public static int field897 = 0;
   @OriginalMember(
      owner = "client!rv",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field899 = new int[8];
   @OriginalMember(
      owner = "client!rv",
      name = "k",
      descriptor = "I"
   )
   public static int field898;
   @OriginalMember(
      owner = "client!rv",
      name = "n",
      descriptor = "I"
   )
   public static int field900;
   @OriginalMember(
      owner = "client!rv",
      name = "p",
      descriptor = "I"
   )
   public static int field901;
   @OriginalMember(
      owner = "client!rv",
      name = "q",
      descriptor = "I"
   )
   public static int field902;
   @OriginalMember(
      owner = "client!rv",
      name = "r",
      descriptor = "I"
   )
   public static int field903;
   @OriginalMember(
      owner = "client!rv",
      name = "o",
      descriptor = "I"
   )
   public static int field904;
   @OriginalMember(
      owner = "client!rv",
      name = "m",
      descriptor = "I"
   )
   public static int field905;
   @OriginalMember(
      owner = "client!rv",
      name = "j",
      descriptor = "I"
   )
   public static int field906;

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method665(boolean arg0) {
      try {
         if (arg0) {
            field899 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field907[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field903;
         if (arg1) {
            field897 = 1;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field907[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field905;
         if (!arg0) {
            field897 = -31;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field907[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method666(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field902;
         if (!class652.field9742) {
            return false;
         } else {
            if (!arg0) {
               field897 = -29;
            }

            int var4 = arg2 >> 16;
            int var5 = 65535 & arg2;
            if (class419.field5722[var4] != null && class419.field5722[var4][var5] != null) {
               int var10000;
               class642 var6;
               class541 var7;
               label193: {
                  var6 = class419.field5722[var4][var5];
                  if (~arg1 != 0 || var6.field9493 != 0) {
                     var7 = (class541)class500.field6967.method288(0);
                     if (var3) {
                        if (~var7.field7914 == ~arg1 && ~var6.field9482 == ~var7.field7908 && (~var7.field7909 == -14 || var7.field7909 == 1004 || ~var7.field7909 == -4 || ~var7.field7909 == -46 || ~var7.field7909 == -17)) {
                           return true;
                        }

                        var7 = (class541)class500.field6967.method290(17958);
                     }

                     while(true) {
                        while(var7 != null) {
                           if (~var7.field7914 == ~arg1 && ~var6.field9482 == ~var7.field7908 && (~var7.field7909 == -14 || var7.field7909 == 1004 || ~var7.field7909 == -4 || ~var7.field7909 == -46 || ~var7.field7909 == -17)) {
                              return true;
                           }

                           var7 = (class541)class500.field6967.method290(17958);
                        }

                        if (!var3) {
                           if (!var3) {
                              var10000 = 0;
                              if (!var3) {
                                 return false;
                              }
                              break label193;
                           }
                           break;
                        }

                        var7 = (class541)class500.field6967.method290(17958);
                     }
                  }

                  var7 = (class541)class500.field6967.method288(0);
                  if (var3) {
                     var10000 = ~var7.field7909;
                  } else if (var7 == null) {
                     var10000 = 0;
                     if (!var3) {
                        return false;
                     }
                  } else {
                     var10000 = ~var7.field7909;
                  }
               }

               while(true) {
                  if (var10000 != -14 && ~var7.field7909 != -1005 && ~var7.field7909 != -4 && var7.field7909 != 45 && var7.field7909 != 16) {
                     var7 = (class541)class500.field6967.method290(17958);
                  } else {
                     class642 var8 = class82.method795(var7.field7908, -26545);
                     if (var3) {
                        if (var6.field9482 == var8.field9482) {
                           return true;
                        }

                        var8 = class688.method5030(0, var8);
                     }

                     while(var8 != null) {
                        if (var6.field9482 == var8.field9482) {
                           return true;
                        }

                        var8 = class688.method5030(0, var8);
                     }

                     var7 = (class541)class500.field6967.method290(17958);
                  }

                  if (var7 == null) {
                     var10000 = 0;
                     if (!var3) {
                        return false;
                     }
                  } else {
                     var10000 = ~var7.field7909;
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field907[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method667(byte arg0) {
      try {
         class513.field7158 = -1;
         class607.field8981 = -1;
         int var1 = -45 % ((-6 - arg0) / 44);
         ++field900;
         class779.field11361 = 0;
         class549.field8103 = -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field907[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class67(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rv",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class67(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field898;
         if (arg0 != 1) {
            field899 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field907[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field904;
         if (arg0 >= -46) {
            field899 = null;
         }

         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field907[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method668(int arg0) {
      try {
         ++field901;
         return arg0 != -18033 ? 84 : super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field907[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method669(int arg0) {
      boolean var1 = client.field1481;

      try {
         class569.field8365.method236((byte)116);
         ++field906;
         int var2 = 0;
         if (var1) {
            class699.field10234[var2] = 0L;
            ++var2;
         }

         while(true) {
            while(~var2 > -33) {
               class699.field10234[var2] = 0L;
               ++var2;
            }

            int var3 = 0;
            if (!var1) {
               if (var1) {
                  class145.field1817[var3] = 0L;
                  ++var3;
               }

               while(true) {
                  while(~var3 > -33) {
                     class145.field1817[var3] = 0L;
                     ++var3;
                  }

                  class363.field5045 = 0;
                  if (!var1) {
                     if (arg0 < 83) {
                        field899 = null;
                        return;
                     }

                     return;
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field907[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method670(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method671(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
