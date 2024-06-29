import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class189 {
   @OriginalMember(
      owner = "client!wp",
      name = "e",
      descriptor = "Lhc;"
   )
   public class150 field2841 = new class150();
   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "Z"
   )
   public boolean field2844 = false;
   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2845 = new String[]{method1652(method1651("AX\u0004\u001eN")), method1652(method1651("M\u0006\u0004r\u001b")), method1652(method1651("T\u0003F\\")), method1652(method1651("M\u0006\u0004\fZT\u001f^\u000e\u001b")), method1652(method1651("M\u0006\u0004t\u001b")), method1652(method1651("M\u0006\u0004q\u001b")), method1652(method1651("M\u0006\u0004s\u001b"))};
   @OriginalMember(
      owner = "client!wp",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field2839 = true;
   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "I"
   )
   public static int field2838;
   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "I"
   )
   public static int field2840;
   @OriginalMember(
      owner = "client!wp",
      name = "f",
      descriptor = "I"
   )
   public static int field2842;
   @OriginalMember(
      owner = "client!wp",
      name = "d",
      descriptor = "I"
   )
   public static int field2843;

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public final void method1647(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != 0) {
            this.field2844 = false;
         }

         ++field2840;

         do {
            class321 var3 = (class321)this.field2841.method1397(22527);
            if (var3 == null) {
               break;
            }

            var3.method1995((byte)35);
            class600.method4429(-126, var3);
         } while(!var2);

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2845[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(Lbv;B)V",
      line = 27
   )
   public final void method1648(class321 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2842;
         class294 var4 = arg0.field4623;
         boolean var5 = true;
         class362[] var6 = arg0.field4630;
         int var7 = 0;
         class321 var8;
         class321 var9;
         int var12;
         boolean var10000;
         int var10001;
         if (var3) {
            var10000 = var6[var7].field5406;
         } else if (var7 >= var6.length) {
            var10000 = var5;
            if (!var3) {
               if (var5) {
                  return;
               }

               label214: {
                  if (this.field2844) {
                     var8 = (class321)this.field2841.method1394((byte)-128);
                     if (var3) {
                        if (var8.field4623 == var4) {
                           var8.method1995((byte)35);
                           class600.method4429(-118, var8);
                        }

                        var8 = (class321)this.field2841.method1400(false);
                     }
                  } else {
                     var9 = (class321)this.field2841.method1394((byte)-113);
                     if (!var3) {
                        break label214;
                     }

                     var8 = (class321)this.field2841.method1400(false);
                  }

                  while(true) {
                     while(var8 != null) {
                        if (var8.field4623 == var4) {
                           var8.method1995((byte)35);
                           class600.method4429(-118, var8);
                        }

                        var8 = (class321)this.field2841.method1400(false);
                     }

                     var9 = (class321)this.field2841.method1394((byte)-113);
                     if (!var3) {
                        break;
                     }

                     var8 = (class321)this.field2841.method1400(false);
                  }
               }

               if (var3) {
                  if (~var9.field4623.field4094 >= ~var4.field4094) {
                     class88.method858(110, arg0, var9);
                     return;
                  }

                  var9 = (class321)this.field2841.method1400(false);
               }

               while(true) {
                  if (var9 == null) {
                     this.field2841.method1398(true, arg0);
                     var12 = arg1;
                     var10001 = -97;
                     if (!var3) {
                        if (arg1 != -97) {
                           this.method1648((class321)null, (byte)-5);
                           return;
                        }

                        return;
                     }
                  } else {
                     var12 = ~var9.field4623.field4094;
                     var10001 = ~var4.field4094;
                  }

                  if (var12 >= var10001) {
                     class88.method858(110, arg0, var9);
                     return;
                  }

                  var9 = (class321)this.field2841.method1400(false);
               }
            }
         } else {
            var10000 = var6[var7].field5406;
         }

         do {
            while(true) {
               if (var10000) {
                  var5 = false;
                  if (!var3) {
                     var10000 = var5;
                     break;
                  }

                  ++var7;
               } else {
                  ++var7;
               }

               if (var7 >= var6.length) {
                  var10000 = var5;
                  if (!var3) {
                     if (var5) {
                        return;
                     }

                     label81: {
                        if (this.field2844) {
                           var8 = (class321)this.field2841.method1394((byte)-128);
                           if (var3) {
                              if (var8.field4623 == var4) {
                                 var8.method1995((byte)35);
                                 class600.method4429(-118, var8);
                              }

                              var8 = (class321)this.field2841.method1400(false);
                           }
                        } else {
                           var9 = (class321)this.field2841.method1394((byte)-113);
                           if (!var3) {
                              break label81;
                           }

                           var8 = (class321)this.field2841.method1400(false);
                        }

                        while(true) {
                           while(var8 != null) {
                              if (var8.field4623 == var4) {
                                 var8.method1995((byte)35);
                                 class600.method4429(-118, var8);
                              }

                              var8 = (class321)this.field2841.method1400(false);
                           }

                           var9 = (class321)this.field2841.method1394((byte)-113);
                           if (!var3) {
                              break;
                           }

                           var8 = (class321)this.field2841.method1400(false);
                        }
                     }

                     if (var3) {
                        if (~var9.field4623.field4094 >= ~var4.field4094) {
                           class88.method858(110, arg0, var9);
                           return;
                        }

                        var9 = (class321)this.field2841.method1400(false);
                     }

                     while(true) {
                        if (var9 == null) {
                           this.field2841.method1398(true, arg0);
                           var12 = arg1;
                           var10001 = -97;
                           if (!var3) {
                              if (arg1 != -97) {
                                 this.method1648((class321)null, (byte)-5);
                                 return;
                              }

                              return;
                           }
                        } else {
                           var12 = ~var9.field4623.field4094;
                           var10001 = ~var4.field4094;
                        }

                        if (var12 >= var10001) {
                           class88.method858(110, arg0, var9);
                           return;
                        }

                        var9 = (class321)this.field2841.method1400(false);
                     }
                  }
               } else {
                  var10000 = var6[var7].field5406;
               }
            }
         } while(var3);

         if (!var5) {
            label115: {
               if (this.field2844) {
                  var8 = (class321)this.field2841.method1394((byte)-128);
                  if (var3) {
                     if (var8.field4623 == var4) {
                        var8.method1995((byte)35);
                        class600.method4429(-118, var8);
                     }

                     var8 = (class321)this.field2841.method1400(false);
                  }
               } else {
                  var9 = (class321)this.field2841.method1394((byte)-113);
                  if (!var3) {
                     break label115;
                  }

                  var8 = (class321)this.field2841.method1400(false);
               }

               while(true) {
                  while(var8 != null) {
                     if (var8.field4623 == var4) {
                        var8.method1995((byte)35);
                        class600.method4429(-118, var8);
                     }

                     var8 = (class321)this.field2841.method1400(false);
                  }

                  var9 = (class321)this.field2841.method1394((byte)-113);
                  if (!var3) {
                     break;
                  }

                  var8 = (class321)this.field2841.method1400(false);
               }
            }

            if (var3) {
               if (~var9.field4623.field4094 >= ~var4.field4094) {
                  class88.method858(110, arg0, var9);
                  return;
               }

               var9 = (class321)this.field2841.method1400(false);
            }

            while(true) {
               if (var9 == null) {
                  this.field2841.method1398(true, arg0);
                  var12 = arg1;
                  var10001 = -97;
                  if (!var3) {
                     if (arg1 != -97) {
                        this.method1648((class321)null, (byte)-5);
                        return;
                     }

                     return;
                  }
               } else {
                  var12 = ~var9.field4623.field4094;
                  var10001 = ~var4.field4094;
               }

               if (var12 >= var10001) {
                  class88.method858(110, arg0, var9);
                  return;
               }

               var9 = (class321)this.field2841.method1400(false);
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2845[1] + (arg0 != null ? field2845[0] : field2845[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(B)[Lpi;",
      line = 101
   )
   public static final class521[] method1649(byte arg0) {
      try {
         ++field2838;
         if (arg0 < 22) {
            method1649((byte)22);
         }

         return new class521[]{class339.field4821, class415.field6076, class645.field9381};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2845[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "<init>",
      descriptor = "(Z)V",
      line = 123
   )
   public class189(boolean arg0) {
      try {
         this.field2844 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2845[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(BI)Lpg;",
      line = 131
   )
   public static final class762 method1650(byte arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != -16) {
            method1650((byte)49, 31);
         }

         ++field2843;
         class762[] var3 = class80.method809((byte)67);
         int var4 = 0;
         if (!var2 && var3.length <= var4) {
            return null;
         } else {
            do {
               class762 var5 = var3[var4];
               if (var5.field11042 == arg1) {
                  return var5;
               }

               ++var4;
            } while(var3.length > var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2845[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1651(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1652(char[] arg0) {
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
            var10005 = 118;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
